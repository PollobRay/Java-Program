class Outer
{
	int x=10;

	class Inner
	{
		void if1()
		{
			System.out.println("if1() : "+x);
		}
	}
}
public class Test 
{
	public static void main(String ar[])
	{
		Outer out=new Outer();
		Outer.Inner o=out.new Inner();
		o.if1();
	}
}