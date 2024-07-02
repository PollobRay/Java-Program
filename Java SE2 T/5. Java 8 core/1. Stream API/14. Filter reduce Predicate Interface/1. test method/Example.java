import java.util.stream.Stream;
import java.util.function.*;
import java.util.*;
public class Example
{
	public static void main(String[] ar)
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
	
		Predicate<Integer> p=new Predicate<> ()
		{
			public boolean test(Integer i)
			{
				return i%5==0;
			}
		};
		
		System.out.println(values.stream().filter(p).reduce(0,(c,e) -> c+e));
	}
}