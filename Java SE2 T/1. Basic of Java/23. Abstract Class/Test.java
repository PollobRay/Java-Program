abstract class Hello
{
	public abstract void print();
}
class Test extends Hello // it is concrete class of Hello
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String ar[])
	{
		new Test().print();
	}
}
