import java.util.*;

class Test 
{
	public static void main(String ar[])
	{
		Set<Integer> val=new HashSet<> ();
		val.add(84);
		val.add(50);
		val.add(60);
		val.add(24);
		
		for(int i:val)
		{
			System.out.println(i);
		}
		
		Set<Integer> val1=new TreeSet<> ();
		val1.add(84);
		val1.add(50);
		val1.add(60);
		val1.add(24);
		
		for(int i:val1)
		{
			System.out.println(i);
		}
	}
}
