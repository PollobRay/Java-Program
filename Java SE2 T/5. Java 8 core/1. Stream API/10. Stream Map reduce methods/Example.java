import java.util.function.*;
import java.util.*;
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
		
	}
}