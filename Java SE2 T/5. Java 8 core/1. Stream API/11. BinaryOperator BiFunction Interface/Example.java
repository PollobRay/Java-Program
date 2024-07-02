// BinaryOperator  extends BiFunction interface
import java.util.function.*;
import java.util.*;
import java.util.stream.Stream;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		
		// start
		int result=0;
		for(int i:values)
		{
			result=result+i*2;
		}
		// end
		
		// same as
		System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
		
		
		Function<Integer,Integer> f=new Function<> () // here first Integer is parameter type  & second Integer is return type
		{
			public Integer apply(Integer i)
			{
				return i*2;
			}
		};
		
		BinaryOperator<Integer> b=new BinaryOperator<> ()
		{
			public Integer apply(Integer i,Integer j)
			{
				return i+j;
			}
		};
		
		Stream s=values.stream(); // it return values as Stream
		
		Stream s1=s.map(f); // return i*2 stream
		
		int results=(Integer) s1.reduce(0,b); // 0 is initilization values & b is next values of list
		
		System.out.println(results);
		
		
		// same as
		// System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
	}
}