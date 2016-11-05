package com.org.mayur;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass
{

	public static void main(String[] args) throws ClassNotFoundException
	{

		try
		{
			FileOutputStream  out =  new FileOutputStream("E:/data");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			
			DemoClass d1 = new DemoClass(10 , new DateClass(1,12,14));
			DemoClass d2 = new DemoClass(20,new DateClass(2,11,15));
			DemoClass d3 = new DemoClass(30,new DateClass(3,10,16));
			
			oos.writeObject(d1);
			oos.writeObject(d2);
			oos.writeObject(d3);
			oos.flush();
			
			oos.close();
					
			
			System.out.println("*********Deserialize**********");
			File f = new File("E:/data");
			FileInputStream fin = new FileInputStream(f);
			ObjectInputStream ois= new ObjectInputStream(fin);
			
			
			
			int data = 0;
			
			
			while( (data = ois.available()) != -1 )
			{
				
				DemoClass d = (DemoClass)ois.readObject();
				d.printData();
				System.out.println(" Number : "+d.number+" Date : "+d.date.getStringDate());
			}
			
			/*DemoClass dc1= (DemoClass)ois.readObject();
			DemoClass dc2= (DemoClass)ois.readObject();
			DemoClass dc3= (DemoClass)ois.readObject();
			DemoClass dc4= (DemoClass)ois.readObject();*/
			
			
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (EOFException e)
		{
		
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}

}
