import java.util.*;

class Test 
{
	public static void main(String ar[])
	{
		ArrayList<String> names=new ArrayList<> ();
		
		names.add("Pollob");
		names.add("Roy");
		names.add("Atik");
		names.add("Nippon");
		names.add("Pollob");
		names.add("Roy");
		
		Set<String> s=new HashSet<> ();
		
		for(String name:names)
		{
			if(s.add(name)==false)
			{
			System.out.println(name);
			}
		}
		
	}
}

