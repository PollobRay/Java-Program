class Super
{
	int x=10;

	void Disp()
	{
		System.out.println("Super class :"+x);
	}
}

class Sub extends Super
{
	int y=20;

	void Disp()
	{
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}
}

class Test
{
	public static void main(String[] args) {
		
		Sub obj=new Sub();
		obj.Disp();
	}
}