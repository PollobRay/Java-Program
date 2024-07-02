class A
{
	public void f1(int x)
	{
		System.out.println("class a");
	}
}


class B extends A
{
	public void f1(int x,int y)
	{
		System.out.println("Class b");
	}
}

public class Example
{
	public static void main(String ar[])
	{
		B ob=new B();
		ob.f1(5);
		ob.f1(4,10);
	}
}