class Test
{
	int a,b;
	void cal(int x)
	{
		a=x;
		System.out.println("Square is :"+(a*a));
	}
	void cal(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("Addition of a & b is :"+(a+b));
	}
}
class Main
{
	public static void main(String[] args) {
		
		Test obj=new Test();
		obj.cal(10,20);
		obj.cal(5);
	}
}