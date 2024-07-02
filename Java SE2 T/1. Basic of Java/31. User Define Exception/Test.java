class Test
{
	public static void main(String[] args) {
		
		int i=5;
		try{
			if(i<10)
			{
				throw new MyException("The number is smoller than 10");
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}