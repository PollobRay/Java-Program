import java.util.function.*;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		Consumer<Integer> c=new Consumer<> ()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		};
		
		values.forEach(c);
	}
}