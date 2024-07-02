public class Test
{
	private static int k;

	static
	{
		System.out.println("Static initilization block k : "+k);
		k=10;
	}


	public static void main(String ar[])
	{
		Test o=new Test();
		Test ob=new Test();
	}
}