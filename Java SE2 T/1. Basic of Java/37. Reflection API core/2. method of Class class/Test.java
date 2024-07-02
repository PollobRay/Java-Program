package inc.roy;

interface A
{
	
}

class B 
{
	
}

public class Test 
{
	public static void main(String ar[]) throws Exception
	{
		Class<?> c=Class.forName("inc.roy.A");
		
		System.out.println("It is Interface :"+ c.isInterface());
		
		Class<?> cb=Class.forName("inc.roy.B");
		System.out.println("Super class of B :"+ cb.getSuperclass());
		
		System.out.println("Field or Variable of B :" +cb.getDeclaredFields());
		System.out.println("Method of B :"+cb.getDeclaredMethods());
	}
}
