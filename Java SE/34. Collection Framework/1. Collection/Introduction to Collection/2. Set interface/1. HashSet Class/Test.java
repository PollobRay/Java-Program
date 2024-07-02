import java.util.*;

public class Test 
{
	public static void main(String args[])
	{

		HashSet h=new HashSet();
		h.add("One");
		h.add("Two");
		h.add("Three");
		h.add("One"); // no add one again, it return false
		System.out.println(h);
	}
}