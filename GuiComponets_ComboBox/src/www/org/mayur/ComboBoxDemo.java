package www.org.mayur;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

public class ComboBoxDemo extends JFrame implements ActionListener, MouseListener
{
	JComboBox<String> comBox;
	JPopupMenu menu;
	JMenuItem menuItem_Copy,menuItem_Paste,menuItem_Delete,menuItem_Close;
	
	public ComboBoxDemo()
	{
		// Combobox //
		comBox = new JComboBox<String>();
		
		comBox.addItem(" One ");
		comBox.addItem(" Two ");
		comBox.addItem(" Three ");
		comBox.addActionListener(this);
		
		// Popup Menu // this context menu pop up on mouse right click
		menu = new JPopupMenu();
		menuItem_Copy = new JMenuItem("Copy");
		menuItem_Paste= new JMenuItem("Paste");
		menuItem_Delete= new JMenuItem("Delete");
		menuItem_Close= new JMenuItem("Close");
		
		menu.add(menuItem_Copy);
		menu.add(menuItem_Paste);
		menu.add(menuItem_Delete);
		menu.add(menuItem_Close);

		menuItem_Copy.addActionListener(this);
		menuItem_Paste.addActionListener(this);
		menuItem_Delete.addActionListener(this);
		menuItem_Close.addActionListener(this);

		this.addMouseListener(this);

		this.setLayout(new FlowLayout());

		this.add(comBox); // add combobox to frame 
		this.add(menu); // add popup context menu to frame

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
		if(arg0.getSource().equals(comBox))
		{
			System.out.println(" "+ ( comBox.getSelectedItem() ));
		}
		else if(arg0.getSource().equals(menuItem_Copy))
		{
			System.out.println(" Copy ");

		}
		else if(arg0.getSource().equals(menuItem_Paste))
		{
			System.out.println(" Paste ");

		}
		else if(arg0.getSource().equals(menuItem_Delete))
		{
			System.out.println(" Delete ");

		}
		else if(arg0.getSource().equals(menuItem_Close))
		{
			System.out.println(" Close ");

		}
			
	}


	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// show the context menu on right click
		if(arg0.getButton()==3)
		{
			System.out.println(" Right Clicked ");
			menu.show(this, arg0.getX(), arg0.getY());

		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void mousePressed(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

	
	
	
}
