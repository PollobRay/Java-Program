import java.util.Random;
class Test
{
	public static void main(String ar[])
	{
		Random r=new Random();
		int a=r.nextInt(50); // maximum value is 50
		System.out.println(a);
	}
}