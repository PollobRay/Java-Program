
class A
{
	A()
	{
		System.out.println("Constructor in class A");
	}
}

class B extends A
{
	B()
	{
		super(); // For A Constructor
		System.out.println("Constructor in class B");
	}
}


class Test
{
	public static void main(String[] args) {
		
		B obj=new B();
	}
}