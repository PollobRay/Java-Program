class Test
{
	public static void main(String args[])
	{
		int balance=5000;
		int withdrawlAmount=6000;


		try
		{
			if(balance<withdrawlAmount)
			{
			throw new ArithmeticException("Insufficient balance");
			}
			balance=balance-withdrawlAmount;
			System.out.println("Transaction Successfully");
		}
		catch(ArithmeticException e )
		{
			System.out.println("Exception : "+e.getMessage());
		}

		System.out.println("Program continue..");

	}
}