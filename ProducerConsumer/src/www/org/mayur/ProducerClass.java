package www.org.mayur;

public class ProducerClass extends Thread
{
	ResourceClass res;

	public ProducerClass(ResourceClass res)
	{
		this.res = res; 
	}

	@Override
	public void run()
	{
			if(!res.write())
			{
				try
				{
					this.wait();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		
	}

}
