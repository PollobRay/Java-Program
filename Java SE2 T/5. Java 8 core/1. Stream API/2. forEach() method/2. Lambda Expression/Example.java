import java.util.function.Consumer;
import java.util.*;
class Example
{
	public static void main(String ar[])
	{
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		
		
		// create Interface object
		Consumer<Integer> c=(Integer i) -> System.out.println(i);
					//Same
		Consumer<Integer> c1=i -> System.out.println(i);
		
		values.forEach(c);
		
		System.out.println("");
		
		values.forEach(c1);
		System.out.println("");
		
		//  Same as Above of this
		values.forEach(i -> System.out.println(i));
	}
}