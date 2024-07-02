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
		
		// more 
		System.out.println(values.stream().filter(i -> i%5==0).reduce(0,(c,e) -> c+e));
		
		// and
		System.out.println(values.stream().filter(i -> i%5==0).map(i -> i*2).reduce(0,(c,e) -> c+e));
		
		// find First
		System.out.println(values.stream().filter( i-> i%5==0).map(i ->i*2).findFirst());// return first number
		/* same
		int result =0;
		for(int i:values)
		{
			if(i%5==0)
			{
				result=i*2;
				break;
			}
		}
		*/
		
		// or else
			System.out.println(values.stream().filter(i -> i%5==0).findFirst().orElse(0));// if not found then return 0
					//here findFirst() is terminal method
	}
}