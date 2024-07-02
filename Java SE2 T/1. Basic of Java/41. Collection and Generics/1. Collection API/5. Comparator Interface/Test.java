import java.util.*;
class Test 
{
	public static void main(String ar[])
	{
		List<Integer> values=new ArrayList<> ();
		values.add(305);
		values.add(998);
		values.add(774);
		values.add(854);
		values.add(994);
		
		Comparator<Integer> com=new Compar();
		Collections.sort(values,com);
		System.out.println(values);
		
		//using Lambda Expression
		Comparator<Integer> com1=(o1,o2) ->
		{
			return o1%10>o2%10?-1:1;
		};
		Collections.sort(values,com1);
		System.out.println(values);
	}
}

class Compar implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
	if(o1%10 >o2%10)
		return 1;
	
	return -1;
	}
	/*
	101  
	for '0'
	if(o1%100>o2%100)
		return 1;
	
	return -1;
	
	*/
}