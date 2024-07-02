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
		
		System.out.println(values.stream().filter(Example::isVisible).map(Example::mapDouble).findFirst().orElse(0));
		
		
	}
	
	public static boolean isVisible(int i)
	{
		System.out.println("In isvisible");
		
		return i%5==0;
	}
	public static int mapDouble(int i)
	{
		System.out.println("In mapDouble "+i);
		return i*2;
	}
}