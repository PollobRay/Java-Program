import java.util.function.*;
import java.util.*;
import java.util.stream.Stream;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		Stream<Integer> s=values.stream();
		
		Stream<Integer> s1=s.map(new Function<Integer, Integer>()
		{
			public Integer apply(Integer i)
			{
				return i*2;
			}
		}
		);
		
		// In Sort
		Stream<Integer> s2=s.map((i) -> i*2);
		
		// same as
		Integer result=(Integer) s1.reduce(0, new BinaryOperator<Integer> ()
		{
			public Integer apply(Integer i,Integer j) // i is carry & j is value  like  j +=i;
			{
				return i+j;
			}
		});
		
		// in sort
		Integer result1=(Integer) s1.reduce(0,(i,j) -> i+j);
		
		
		/* Logic 
		Integer result2=(Integer) s1.reduce(0,(c,e) -> c+e);
					First c=0   then c=first value
					then c=carry of c+e in Binary addition
					and e=e+c;
					
					*/
	
	// More Efficient
	Integer result3=s.map(i -> i*2).reduce(0,(c,e) -> c+e);
	
	// More Efficient
	Integer result4=values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e);
	
	// More Efficient
	System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));
	}
}