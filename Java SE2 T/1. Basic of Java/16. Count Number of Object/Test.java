class Test 
{
	static int i=0;
	
	public Test()
	{
		i++;
	}
	public void show()
	{
		System.out.println(i);
	}
	
	public static void main(String ar[])
	{
		Test t1=new Test();
		Test t2=new Test();
		Test t3=new Test();
		
		t1.show();
	}
}
		