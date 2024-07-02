
enum Mobile
{
	APPLE,SAMSUNG,HTC;
}

public class Example
{
	public static void main(String ar[])
	{
		Mobile m=Mobile.APPLE;
		Mobile m1=Mobile.HTC;
		
		
		switch(m)
		{
			case APPLE:
				System.out.println("Apple");
				break;
			
			case HTC:
				System.out.println("HTC");
				break;
				
		}
	}
}
