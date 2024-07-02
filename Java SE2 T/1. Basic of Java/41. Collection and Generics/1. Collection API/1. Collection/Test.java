import java.util.*;

class Test 
{
	public static void main(String ar[])
	{
		Collection values=new ArrayList(); // Object type
		values.add(8);
		values.add("Pollob");
		
		System.out.println(values);
		
		Collection<Integer> val=new ArrayList<> ();
		val.add(3);
		val.add(50);
		val.add(80);
		
		for(int i:val)
		{
			System.out.println(i);
		}
		
	}
}
