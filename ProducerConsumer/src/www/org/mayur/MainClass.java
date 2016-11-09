package www.org.mayur;

public class MainClass
{
	
	public static void main( String args[])
	{
		ResourceClass res = new ResourceClass();
		
		ProducerClass p = new ProducerClass(res);
		ConsumerClass c = new ConsumerClass(res);
	
		c.start();
		p.start();
	}
	
}
