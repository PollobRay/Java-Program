class A
{
	public void f1(int x)
	{
		System.out.println("Class A");
	}
}

class B extends A
{
	public void f1(int y) // method overriding 
	{   /*
		if you want to access Class A f1(int x)
		then, you have to write super.f1(5);
		*/
		super.f1(5); // call f1(int x) of A


		System.out.println("class B");
	}
}

public class Test
{
	public static void main(String ar[])
	{
	B ob=new B();
	ob.f1(5); //here called   f1() of subclass
	}
}