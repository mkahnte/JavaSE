package www.com.mayur;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GuiDemoApplication extends JFrame implements ActionListener
{
	JButton btn1,btn2,btn3;
	JTextField txt1;
	private static GuiDemoApplication instance = null;
		
	private GuiDemoApplication()
	{
		btn1 = new JButton(" Button 1");
		btn2 = new JButton(" Button 2");
		btn3 = new JButton(" Button 3");

		// Method 1 //
		btn1.addActionListener(this);
		
		
		// Method 2 //
		btn2.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				txt1.setText(" Action Event Method 2 ");
			
			}
		});
		
		
		// Method 3 // to implement we require =>  //Singleton pattern//
		btn3.addActionListener( new GenericActionListner() );
		

		
		txt1 = new JTextField(20);
	
		this.setLayout(new FlowLayout());
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
		this.add(txt1);
		this.setBounds(300,100,600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static GuiDemoApplication getInstance()
	{
		if(instance==null)
		{
			instance = new GuiDemoApplication();
			System.out.println(" New Instance ");
		}
		
		return instance;
	}
	
	
	public static void main(String[] args)
	{
		// Create instance usig public getInstance mehod only //
		GuiDemoApplication app1 = GuiDemoApplication.getInstance();

		app1.setVisible(true);

	
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		txt1.setText(" Action Event Method 1 ");
		
		System.out.println(" Button 1 : "+btn1.hashCode());
		System.out.println(" Button 2 : "+btn2.hashCode());
		System.out.println(" Button 3 : "+btn3.hashCode());

		
	}

}
