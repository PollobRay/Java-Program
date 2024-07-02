class Test
{
	int a,b;
	Test()
	{
		System.out.println("Default constructor");
		a=10;
		b=20;
	}
	void disp()
	{
		System.out.println("A :"+a);
		System.out.println("B :"+b);
	}
}
class Main
{
	public static void main(String[] args) {
		Test obj =new Test();
		obj.disp();
	}
}