import java.util.*;
class Test 
{
	public static void main(String[] args)
	{

		LinkedList list=new LinkedList();
		list.add("Pollob");
		list.add(1,"Roy");
		list.addLast("P C Roy");

		System.out.println(list.getFirst());
		System.out.println(list.get(1));
		System.out.println(list.getLast());
	}
}