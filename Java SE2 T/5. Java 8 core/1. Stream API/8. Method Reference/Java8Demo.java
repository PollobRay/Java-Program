import java.util.*;
public class Java8Demo
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		values.forEach(i -> showit(i));
		// same as
		values.forEach(Java8Demo::showit);

		}
		
		public static void showit(int i)
		{
			System.out.println(i);
		}
}
