class Outer
{
	static int x;

	static class Inner 
	{
		void if1()
		{
			System.out.println("if1 () : "+x);
		}
	}
}

public class Test 
{
	public static void main(String ar[])
	{
		Outer.Inner o=new Outer.Inner();
		o.if1();
	}
}