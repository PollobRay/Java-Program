import java.util.function.*;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
	
		values.forEach(new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
			
		});
		
		// same as
		values.forEach(i -> System.out.println(i)); // here i is parameter of function
	}
}