// Default throw and our catch
class Test
{
	public static void main(String args[])
	{
		try{
			System.out.println(3/0); // have exception
			System.out.println("In try"); // the not run
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception : "+e.getMessage());
		}
	}
}