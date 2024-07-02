class A extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread A : "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		int i;
		for(i=0;i<=0;i++)
		{
			System.out.println("Thread B : "+i);
		}
	}
}

public class Test 
{
	public static void main(String args[])
	{
		A ob1=new A();
		B ob2=new B();
		ob1.start();
		ob2.start();
	}
}