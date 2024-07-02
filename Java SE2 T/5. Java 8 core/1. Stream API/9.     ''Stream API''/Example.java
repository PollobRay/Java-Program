import java.util.function.*;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		values.stream().forEach(System.out::println);// it convert to stream
		
		System.out.println("");
		
		values.parallelStream().forEach(System.out::println);// it create thread automitiv=cally
	}
}