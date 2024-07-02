public class Test 
{
	public static void main(String ar[]) throws Exception
	{
		Thread t1=new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
		});
		
		Thread t2=new Thread (() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();// here ew join our thread in Main Thread
					// when join the thread, it willl run first then next line
		t2.join();
		
		System.out.println("Is Thread Alive :"+t1.isAlive());
		System.out.println("Bye");
	}
}
