class A
{
	int no;
	void Msg1()
	{
		System.out.println("Super class no :"+no);
	}
}

class B extends A
{
	int no;
	B(int a,int b)
	{
		super.no=a;
		no=b;
	}

	void Msg1()
	{
		System.out.println("Subclass no :"+no);
	}

	void Disp()
	{
		super.Msg1();
		Msg1();
	}
}

class Test
{
	public static void main(String[] args) {
		
		B obj=new B(100,200);
		obj.Disp();
	}
}