
public class Test 
{
	public static void main(String ar[]) throws Exception 
	{
		try{
			methodA();
			donotCallMe();
			methodB();
		}
		catch(Exception e)
		{
			throw e;
		}
		finally
		{
			System.out.println("Inside finally block");
		}
	}
	public static void methodA()
	{
		System.out.println("Inside method A");
	}
	public static void methodB()throws XyzException
	{
		System.out.println("Inside method B");
		throw new XyzException();
	}
	public static void donotCallMe() throws Exception
	{
		throw new Exception("you dont call me");
	}
}
class XyzException extends Exception{
	public XyzException()
	{
		super();
	}
}
	
		