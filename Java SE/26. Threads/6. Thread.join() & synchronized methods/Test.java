class Test
{
	private static int count=0;

	public static synchronized void inccount()
	{
		count++;
	}


	public static void main(String ar[])
	{

		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10000; i++)
					inccount();
			}
		});

		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10000; i++)
					inccount();
			}
		});


	t1.start();
	t2.start();

	try
	{
		t1.join();
		t2.join();
		/* 
		Thread join() methods can be used to pluse the current thread excecution until unless
		to specified thread is dead
		*/

	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}

	System.out.println("Values : "+count);

	}
}