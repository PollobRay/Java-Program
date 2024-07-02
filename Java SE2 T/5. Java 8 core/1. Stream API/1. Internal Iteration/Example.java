
// We can achieve internal Iteration with the help of Stream API
import java.util.*;
class Example
{
	public static void main(String[] ar)
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		for(int i=0;i<6; i++) // External Iteration
		{
			System.out.println(values.get(i));
		}
		
		Iterator<Integer> i=values.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		for(int iv:values)
		{
			System.out.println(iv);
		}
	}
}

