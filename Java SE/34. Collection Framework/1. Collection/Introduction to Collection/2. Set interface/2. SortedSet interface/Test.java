import java.util.*;

class Test
{
	public static void main(String args[])
	{

		TreeSet t=new TreeSet();
		t.add("B");
		t.add("D");
		t.add("C");
		t.add("A");

		System.out.println(t);
		System.out.println(t.first());// A
		System.out.println(t.last());//D
		System.out.println(t.headSet("C"));// C, D
		System.out.println(t.tailSet("C"));// C,D
		System.out.println(t.subSet("B","D"));// B, C
		System.out.println(t.comparator());// null
	}
}