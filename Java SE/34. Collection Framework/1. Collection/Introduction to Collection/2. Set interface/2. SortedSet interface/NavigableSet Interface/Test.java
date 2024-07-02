import java.util.*;
class Test
{
	public static void main(String args[])
	{

		TreeSet t1=new TreeSet();
		TreeSet t2=new TreeSet();
		t1.add("A");
		t1.add("B");
		t1.add("C");
		t1.add("D");

		t2.add("A");
		t2.add("C");
		t2.add("E");
		t2.add("G");

		System.out.println(t1.ceiling("A"));//A
		System.out.println(t2.ceiling("B"));//C
		System.out.println(t1.floor("C"));// C
		System.out.println(t2.floor("D"));//C
		System.out.println(t1.higher("B"));// C
	}
}
