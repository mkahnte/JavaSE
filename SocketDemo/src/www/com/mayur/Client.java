package www.com.mayur;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Client
{
	JFrame frame;
	JButton btnSend;
	JTextArea txtAreaClient;
	Socket client_Socket;
	DataInputStream in;
	DataOutputStream out; 
		
	public Client()
	{
		frame = new JFrame(" Client ");
		btnSend = new JButton(" Send Data To Server  ");
		txtAreaClient = new JTextArea();
		
		frame.setLayout(new GridLayout(2,1));
		btnSend.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				sendDatatoServer();
			}
		});
		
		
		frame.getContentPane().add(txtAreaClient);
		frame.getContentPane().add(btnSend);
				
		frame.setSize(300, 400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String [] args)
	{
		
		 Client c = new Client();
		 
		 c.createConnection("localhost",4000);
	}
	
	/**
	 create connection to server using specified port.
	 <br>initializes in with DataInputStream 
	 <br>initializes out with DataOutputStream 
	*/
	public void createConnection(String server,int port)
	{
		try
		{
			client_Socket = new Socket(server,port);
			in = new DataInputStream(client_Socket.getInputStream());
			out = new DataOutputStream(client_Socket.getOutputStream());
						
		}
		catch (IOException e)
		{
			System.out.println(" Connection Error : "+ e.getMessage());
			
		}
	}
		
	private void sendDatatoServer()
	{
		try
		{
			String message = this.txtAreaClient.getText().toString();
			this.out.writeUTF(message);
		}
		catch (IOException e)
		{
			System.out.println(" Cannot Send Data : "+ e.getMessage() );
		}
	}
	
	
	
}
