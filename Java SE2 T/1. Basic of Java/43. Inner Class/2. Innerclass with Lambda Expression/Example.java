
@FunctionalInterface
interface B
{
	public void show();
	// it called SAM but after java 8 it called functional Interface.
}

class Example
{
	public static void main(String ar[])
	{
		B ob=() ->System.out.println("Hello");
		ob.show();
	}
}