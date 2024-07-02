

public class Test 
{
	public static void main(String ar[])
	{
		try{
			Abc obj=new Abc();
			obj.i=5;
			obj.j=6;
			
			Abc obj1=(Abc) obj.clone();
			
			System.out.println(obj);
			System.out.println(obj1);
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class Abc implements Cloneable
{
	int i;
	int j;
	
	public String toString()
	{
		return "Abc  i="+i+"  j="+j;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}