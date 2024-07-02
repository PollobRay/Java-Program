import java.util.*;

public class Test 
{
	public static void main(String args[])
	{

		LinkedHashSet h=new LinkedHashSet();
		h.add("One");
		h.add("Two");
		h.add("Three");
		h.add("Four");
		h.add("One"); //not insert

		System.out.println(h);
	}
}