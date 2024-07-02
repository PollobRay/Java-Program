import java.util.function.*;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> Integer.sum(c,e)));
		
		// more efficient
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));// method reference
	}
}