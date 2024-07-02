public class Echo
{
	public static void main(String ar[])
	{
		int s=0;
		for(int i=0; i<ar.length; i++)
			s=s+Integer.parseInt(ar[i]);

		System.out.println("Sum is : "+s);
	}
}