interface I1
{
	void f1(); //abstract
}

interface I2 
{
	void f2();
}

interface I3 extends I1,I2
{
	void f3();
}

interface I4
{
	void f4();
}

class A implements I3,I4
{
	public void f1()
	{

		System.out.println("Pollob");
	}
	public void f2()
	{

		System.out.println("Pollob");
	}
	public void f3()
	{

		System.out.println("Pollob");
	}
	public void f4()
	{
		System.out.println("Pollob");
	}
}

class Test
{
	public static void main(String ar[])
	{
		A obj=new A();
		obj.f1();
		obj.f2();
		obj.f3();
		obj.f4();
	}
}