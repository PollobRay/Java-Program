import java.util.*;

class Container<T extends Number>
{
	T valu;
	public void demo(ArrayList<? super T> obj)
	{
	}
	
}
class Test 
{
	public static void main(String ar[])
	{
	Container<Integer> c=new Container<> ();
	ArrayList<Number> al=new ArrayList<> ();
	
	c.demo(al);
	}
}
	