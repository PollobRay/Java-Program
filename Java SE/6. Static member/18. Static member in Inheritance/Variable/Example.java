class Parent
{
	static int y=4;
}

class Child extends Parent
{
	static{
		y=5;
	}
}

public class Example
{
	public static void main(String ar[])
	{
		System.out.println("Y : "+Child.y); //y=4
	}
}