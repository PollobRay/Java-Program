
public class CallStackdemo
{
	public static void main(String ar[])
	{
		System.out.println("Inside Main");
		methodA();
		System.out.println("Exting Main");
	}
	public static void methodA()
	{
		System.out.println("Inside A");
		methodB();
		System.out.println("Exting A");
	}
	public static void methodB()
	{
		System.out.println("Inside B");
		methodC();
		System.out.println("Exting B");
	}
	public static void methodC()
	{
		System.out.println("Inside C");
		methodD();
		System.out.println("Exting C");
	}
	public static void methodD()
	{
		
		System.out.println("Inside D");
		System.out.println(5/0);
		
		/*
		here the method throw Exception to JVM
		then, JVM try to search maching try cach BlockView
		JVM search try catch block on call stack
		if JVM not get try catch block then the program will end
		
		*/
		System.out.println("Exting D");
	}
}