class Parent
{
	public static void f1()
	{
		System.out.println("Hello");
	}
}
class Child extends Parent
{
	public static void f1() // function hiding
	{
		System.out.println("hi");
	} 
}

public class Example
{
	public static void main(String ar[])
	{
		Child.f1();
	}
}