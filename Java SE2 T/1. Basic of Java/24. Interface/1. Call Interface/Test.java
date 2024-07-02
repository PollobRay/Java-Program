interface Hello
{
	public void print();
}

class Test implements Hello
{
	public void print()
	{
		System.out.println("Hello");
	}
	
	public static void main(String ar[])
	{
		Hello h=new Test();
		h.print(); // Invention
		
		Hello hl=new Hello() // Discovery
		{
			public void print()
			{
				System.out.println("World");
			}
		};
		hl.print();
	}
}
		