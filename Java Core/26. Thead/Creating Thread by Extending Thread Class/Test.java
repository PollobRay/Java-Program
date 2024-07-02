class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From Thread A : "+i);
		}
		System.out.println("Exit From A");
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("From Thread B : "+i);
		}
		System.out.println("Exit From B");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		A obj1=new A();// new born
		B obj2=new B();
		obj1.start(); // runnable
		obj2.start();	
	}
}