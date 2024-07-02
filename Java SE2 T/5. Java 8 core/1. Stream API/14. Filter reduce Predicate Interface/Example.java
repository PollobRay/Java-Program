import java.util.function.*;
import java.util.*;
import java.util.stream.Stream;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
	
		int result=0;
		for(int i:values)
		{
			if(i%5==0)
			{
				result +=i;
			}
		}
		
		System.out.println(result);
		
		
		// same as
		System.out.println(values.stream().filter( i -> i%5 ==0).reduce(0,(c,e) -> c+e));
		
		// and also
		System.out.println(values.stream().filter( i -> i%5 ==0).reduce(0,(c,e) -> c+e));
	}
}