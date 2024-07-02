class Test implements Runnable
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("New Thread");
		}
	}
}

class Main
{
	public static void main(String[] args) {
		
		Test pr=new Test();
		Thread obj=new Thread(pr);
		obj.start();
		for(int i=1; i<=5;i++)
		{
			System.out.println("Main Thread");
		}
	}
}