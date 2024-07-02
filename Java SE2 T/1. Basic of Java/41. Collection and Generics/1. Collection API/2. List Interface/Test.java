import java.util.*;

class Test 
{
	public static void main(String ar[])
	{
		List<Integer> value=new ArrayList<> ();
		value.add(3);
		value.add(99);
		
		value.add(1,88); // here 1 is index
		
		//Collection.sort(value);
		
		value.forEach(System.out::println); // method reference
	}
}
