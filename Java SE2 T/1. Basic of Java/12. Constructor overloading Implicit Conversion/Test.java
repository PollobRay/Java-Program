class Test
{
	public Test()
	{
	}
	
	public Test(double d)
	{
		System.out.println(d);
	}
	
	public static void main(String ar[])
	{
		Test a=new Test(10); // here calll Test(double d)
	}
}