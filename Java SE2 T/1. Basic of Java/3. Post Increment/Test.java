public class Test
{
	public static void main(String ar[])
	{
		int i=5;
		
		i=i++;
		// like
	/*
		int temp;
		temp=i;
		i++;
		i=temp;
	*/
	// same
	
	System.out.println(i);// 5
	}
}