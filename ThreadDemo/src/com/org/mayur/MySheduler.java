package com.org.mayur;

public class MySheduler
{

	public static void main(String[] args) throws InterruptedException
	{
		MyThread t1 = new MyThread(" I ");
		MyThread t2 = new MyThread(" II ");
		MyThread t3 = new MyThread(" III ");

		/*	
		 	t1.join(); 
		 	t1 not started yet. 
		 	So there is no point in waiting for t1 to join. 
		 	main will execute next line.
			
			
			t2.join();
		 	t2 not started yet. 
		 	So there is no point in waiting for t2 to join. 
		 	main will execute next line.
			
			
		*/
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		/*	
	 		t1.join(); 
	 		t2.join();
	 		t3.start();

	 		t1 and t2 are already started.
	 		so after completion of t1 and t2 next line will be executed.
	 		
	 		!Remember : t1 and t2 are both started thus they can execute in any manner.
	 		
	 		if we want t2's execution after t1's execution then 
	 		
	 		t1.start(); 
	 		t1.join(); 
	 		So first t1 will be executed completely. 
	 		main will wait for t1 to join. 
	 		
	 		t2.start(); t2.join();
	 		So first t2 will be executed completely. 
	 		main will wait for t2 to join. 
	 		
	 		t3.start();
	 		

	 	*/
		
		t3.start();
		
		

		
	}

}
