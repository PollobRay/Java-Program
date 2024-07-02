public class Test
{
	public static void main(String ar[])
	{
		float x=3.4f;
	//	int  y=x; //narrowing conversion // Error
		int z=(int)x; // No Error

	//	float k=3.5;// narrowing conversion // Error
				/* here the value of double,
				for this resson there have error.
				When we write 3.5f here no error */

		float s=3.5f;// no Error

		System.out.println("x :"+x+" z :"+z+" s: "+s);
	}
}