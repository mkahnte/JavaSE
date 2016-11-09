package www.com.mayur;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.plaf.SliderUI;

public class Server
{
	JFrame frame;
	JButton btnSend;
	JTextArea txtAreaServer;
	ServerSocket serverSocket;
	Socket server_Socket;
	DataInputStream in;
	DataOutputStream out; 

		
	public Server()
	{
		frame = new JFrame(" Server ");
		btnSend = new JButton(" Send Data To Client  ");
		txtAreaServer = new JTextArea();
		
		frame.setLayout(new GridLayout(2,1));
		btnSend.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sendDatatoClient();
			}
		});
		
		
		frame.getContentPane().add(txtAreaServer);
		frame.getContentPane().add(btnSend);
				
		frame.setSize(300, 400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
	
	public static void main(String [] args)
	{
		
		Server s = new Server();
		s.createConnection(4000);
	}
	
	public void createConnection(int port)
	{
		try
		{
			serverSocket  = new ServerSocket(port);
			
			server_Socket = serverSocket.accept();
			
			in = new DataInputStream(server_Socket.getInputStream());
			out = new DataOutputStream(server_Socket.getOutputStream());
			
			Thread listen_To_InputStream = new Thread( new Runnable()
			{
				@Override
				public void run()
				{
					while(true)
					{	
						try
						{							
							txtAreaServer.setText(in.readUTF());
							Thread.sleep(100);
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						catch (InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			});
			
			listen_To_InputStream.start();
			
			
		}
		catch (IOException e)
		{
			System.out.println(" Error In Connection : "+e.getMessage());
		}
	}
	
	
	private void sendDatatoClient()
	{
		
	}

	
	
}
