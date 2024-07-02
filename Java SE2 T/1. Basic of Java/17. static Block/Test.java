class Test 
{
	
	static{
		System.out.println("Static Bloack");  // run first
		// this block will run, when the class load on JVM before main method
	}
	
	public static void main(String ar[])
	{
		System.out.println("Main Method"); // run second
	}
}