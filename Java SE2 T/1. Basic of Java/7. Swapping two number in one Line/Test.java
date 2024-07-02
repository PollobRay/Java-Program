class Test 
{
	public static void main(String ar[])
	{
		int a=10;
		int b=5;
		b=a+b-(a=b);
		
		System.out.println(a+"  "+b);
	}
}