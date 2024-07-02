import java.util.*;

public class Test 
{
	public static void main(String ar[])
	{
		Map<String,String> map=new HashMap<> ();// first String is key and Second String is ValueBase
		map.put("myname","Pollob");
		map.put("actor","AA");
		
		Set<Map.Entry<String,String>> values=map.entrySet(); // retun all keys
		
		for(Map.Entry<String,String> e:values)
		{
			System.out.println(e.getKey()+"  :  "+e.getValue());
			e.setValue("III");
		}
	}
}
