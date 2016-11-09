package www.org.mayur;

public class ConsumerClass extends Thread
{
	ResourceClass res;

	public ConsumerClass(ResourceClass res)
	{
		this.res = res;
	}

	@Override
	public void run()
	{
		if(!res.read())
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
