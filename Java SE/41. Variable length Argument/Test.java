class Test
{

	int y=0;
	public int add(int... num)
	{
		for(int x:num)
		{
			y=y + x;
		}

		return y;
	}

	public static void main(String args[])
	{
		Test ob=new Test();

		int a=ob.add(10);
		int b=ob.add(10,20);
		int c=ob.add(10,20,30,40);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}