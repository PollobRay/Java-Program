// our throw and default catch
class Test
{
	public static void main(String args[])
	{
		int balance=5000;
		int withdrawAmount=6000;

		if(balance<withdrawAmount)
		{
			throw new ArithmeticException("Insufficient Balance"); // here we create exception & se message

		}
		balance=balance-withdrawAmount;
		System.out.println("Transation Successfully completed");
		System.out.println("Program continue....");
	}
}