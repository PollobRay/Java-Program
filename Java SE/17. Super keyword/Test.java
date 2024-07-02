class A
{
	int z;
	public void f1()
	{
		System.out.println("class A");
	}

	//public A()
	//{
	//	System.out.println("Class A constructor");
	//}
}

class B extends A
{
	public int z=4;
	//z = 2; // initialize local z
	//this.z = 4; //initilize instance z
	//super.z = 4; // initilize Class z

	public void f2()
	{
		System.out.println("class A");
	}

}

public class Test
{
	public static void main(String ar[])
	{
		B ob=new B();
		ob.f1();
		ob.f2();
	}
} 