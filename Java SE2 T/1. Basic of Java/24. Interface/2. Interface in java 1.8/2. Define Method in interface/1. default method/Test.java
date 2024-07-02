interface I
{
	default public void show()
	{
		System.out.println("Hello");
	}
	default public  void print()
	{
		System.out.println("Pollob");
	}
}
class Test implements I 
{
	public static void main(String ar[])
	{
		Test t=new Test();
		t.show();
		t.print();
	}
}
