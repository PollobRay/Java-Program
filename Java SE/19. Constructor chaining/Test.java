class A
{
	int a;
	public A()
	{
		System.out.println("A1");
	}
}

class B extends A
{
	int b;
	public B()
	{
		this(4); // here called B(int x)
		/* when we write this(), then compiler not write supper()
			but if we not write this() then compiler write super()
		*/
		System.out.println("B1");
	}
	public B(int x)
	{
		// here
		/* here compiler call by default super() 
		  but if we write this() then compiler no write super()
		 */
		System.out.println("B2");
	}
}
public class Test
{
	public static void main(String ar[])
	{
		B o1=new B();
	}
}