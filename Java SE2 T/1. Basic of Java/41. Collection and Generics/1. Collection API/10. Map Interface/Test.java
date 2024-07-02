import java.util.*;

public class Test 
{
	public static void main(String ar[])
	{
		Map<String,String> map=new HashMap<> ();// first String is key and Second String is ValueBase
		map.put("myname","Pollob");
		map.put("actor","AA");
		
		Set<String> keys=map.keySet(); // retun all keys
		
		for(String key:keys)
		{
			System.out.println(key+"    "+map.get(key));
		}
	}
}
