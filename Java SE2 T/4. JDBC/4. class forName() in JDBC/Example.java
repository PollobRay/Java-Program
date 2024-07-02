class Example
{
	public static void main(String ar[])
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		/* load Driver class & it execute the Static bloack of the class 'Driver' */
		
		//   same as
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}
}

		