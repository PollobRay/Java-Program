
class Pqr
{
	static
	{
		System.out.println("Static Block");
	}
	
	
	{
		System.out.println("Initilization Block");
	}
}

class Example
{
	public static void main(String ar[])throws Exception
	{
		Class.forName("Pqr");// It load Pqr and JVM execute the static block
		
		Class.forName("Pqr").newInstance(); //creating object and it call Initilization block.
			//       it again run static block
	}
}
