interface I 
{
	static void show()
	{
		System.out.println("Hello");
	}
	
}

class Test implements I 
{
	public static void main(String ar[])
	{
		I.show();
	}
}