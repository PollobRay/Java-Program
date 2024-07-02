class Test 
{
	public static void main(String ar[])
	{
		Test t=new Test();
		t.show(10);
		t.show(1,2,5,10);
	}
	
	public void show(int a)
	{
		System.out.println(a);
	}
	
	public void show(int...a)
	{
		for(int i:a)
			System.out.println(i);
	}
}