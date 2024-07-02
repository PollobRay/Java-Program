class Example
{

	int x;  // Instance Variable
	static int y; // static member Variable
				  // or class member variable

	private static int z; // It's not access in main class

	public void fun1() //instance member function
	{

	}
	public static void fun2()
	{
		y=4;
		// the methods access only static variable
	}

	public static class Test
	{
		public static String country="BD";
	}
}


public class Test
{
 public static void main(String[] ar)
 {

 	Example ex1=new Example();
 	Example.fun2();// Access static method
 	Example.y=10; //access static variable

 	String s;
 	s=Example.Test.country; // Access static class
 	System.out.println(s);

 }
 
}