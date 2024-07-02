/* Runnable is Functional interface its means we can use Lambda Expression
*/

class Test 
{
	public static void main(String adr[])
	{
		// 1
		Runnable o1=new Runnable()
		{
			public void run()
			{
				for(int i=1;i<6; i++)
				{
					System.out.println(i);
				}
			}
		};
		
		// 2
		Runnable o2=()->
		{
			for(int i=1;i<6; i++)
				{
					System.out.println(i);
					try
					{Thread.sleep(1000);}
					catch(Exception e)
					{}
				}
		};
				
		//3
		Thread t3=new Thread(()->
		{
				for(int i=0; i<10;i++)
				{
					System.out.println(i);
				}
		});
				
		Thread t1=new Thread(o1);
		Thread t2=new Thread(o2);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
			