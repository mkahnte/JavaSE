package www.com.mayur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenericActionListner implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
				 
			GuiDemoApplication obj = GuiDemoApplication.getInstance();
		
			obj.txt1.setText(" Action Event Method 3 ");
			System.out.println(" Action Event Method 3 ");
		
	}
}
