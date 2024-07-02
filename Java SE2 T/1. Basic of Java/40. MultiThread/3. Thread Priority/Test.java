class Test 
{
	public static void main(String ar[])
	{
		Thread t1=new Thread(() ->
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
			}
		});
		
		Thread t2=new  Thread(()->
		{
			for(int i=1;i<6;i++)
			{
				System.out.println("Hi"+"  "+Thread.currentThread().getPriority());
			}
		},"Hi Thread");// here it name of Thread
		
		t1.setName("Hello Thread");
		System.out.println(t1.getName());
		
		t1.setPriority(10);
		t2.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
	}
}