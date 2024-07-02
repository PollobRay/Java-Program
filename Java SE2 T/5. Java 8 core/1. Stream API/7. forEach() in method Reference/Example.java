import java.util.function.*;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		
		
		values.forEach(System.out::println); //method reference
					// Ststem.out.println(i)  is same
	}
}