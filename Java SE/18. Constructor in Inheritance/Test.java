class A
{
	int a;
	public A(int a)
	{
		System.out.println("A");
	}
}

class B extends A
{
	int b;
	public B()
	{
		super(4); // here it's called  A()
		/*
			If we Don't write the Line, then compiler write the Line.
			when A() is parameterize constructor then, we have to write the Line

		*/

		System.out.println("B");
	}
}

class Test
{
	public static void main(String ar[])
	{
		B obj=new B(); // this line call Class A & B constructor
	}
}