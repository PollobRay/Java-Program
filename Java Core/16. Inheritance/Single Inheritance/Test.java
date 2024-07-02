class A
{
	int a,b;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	int add()
	{
		System.out.println("super class");
		return(a+b);
	}
}

class B extends A
{
	int multi()
	{
		System.out.println("sub class method");
		return(a*b);
	}
}

class Test
{
	public static void main(String[] args) {
		
		B obj=new B();
		int a,b;
		obj.getdata(5,5);
		a=obj.add();
		b=obj.multi();
		System.out.println("Summation :"+a);
		System.out.println("Multiplexing :"+b);
	}
}