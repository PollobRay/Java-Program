import java.util.*;

public class Test 
{
	public static void main(String args[])
	{

		ArrayList l1=new ArrayList(4);
		l1.add("Pollob");
		l1.add("Roy");
		l1.add(1,"P.C.Roy");

		Iterator it=l1.iterator();
		while(it.hasNext()) // check size
		{
			System.out.println(it.next()); //print values
		}
	}
}