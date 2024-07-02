import java.util.*;

class Test
{
	public static void main(String args[])
	{
	Vector v=new Vector();
	v.add(20);
	v.add(50);
	v.add(10);
	v.add(30);

	System.out.println(v);

	Collections.sort(v);

	System.out.println(v);
	int x=Collections.binarySearch(v,30);
	System.out.println(x);

	Collections.swap(v,1,3); // 1=50  3=30
	System.out.println(v);
	}
}