class A
{
	public void show()
	{
	}
}

class B extends A 
{
	public void show()
	{
	}
}

class Test 
{
	public static void main(String ar[])
	{
		A oba=new A();
		B obb=new B();
		A a;
		a=obb;
		a.show();
	}
}