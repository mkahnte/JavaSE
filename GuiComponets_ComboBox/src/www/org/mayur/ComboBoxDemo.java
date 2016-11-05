package www.org.mayur;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPopupMenu;

public class ComboBoxDemo extends JFrame implements ActionListener
{
	JComboBox<String> comBox;
	JPopupMenu menu;
	
	
	public ComboBoxDemo()
	{
		menu = new JPopupMenu();
		menu.add(" Add ");
		
		comBox = new JComboBox<String>();
		
		comBox.addItem(" One ");
		comBox.addItem(" Two ");
		comBox.addItem(" Three ");
		comBox.addActionListener(this);
	
		this.setLayout(new FlowLayout());
		this.add(comBox);
		this.add(menu);
		this.setBounds(200,100,300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		ComboBoxDemo obj = new ComboBoxDemo();
		obj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		System.out.println(" "+ ( comBox.getSelectedItem() ));
	}

	
}
