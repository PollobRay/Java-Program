class Test
{
	public static void main(String arg[])
	{
		int x=100;

		try
		{
			System.out.println(x/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch called");
			System.out.println(e);
			//return x;
			e.printStackTrace();
		}
		finally
		{
			// x=500;
			System.out.println("Finnally block");
			// return x;
		}
	}
}