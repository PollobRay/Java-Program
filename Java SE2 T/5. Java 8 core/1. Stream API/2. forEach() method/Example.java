import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		// Internal Iteration
		values.forEach(i -> System.out.println(i));
	}
}