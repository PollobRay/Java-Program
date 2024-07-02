interface Hello
{
	public void print();
}
class Test 
{
	public static void main(String ar[])
	{
		Hello h=() -> System.out.println("Hello");
		
		h.print();
	}
}

		
			