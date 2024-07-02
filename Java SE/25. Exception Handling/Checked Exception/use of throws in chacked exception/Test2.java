import java.io.*;

// this program for handle checked Exception

class Test2
{
	public static void main(String ar[])
	{
		try{
			throw new IOException();
		}
		catch(IOException e)
		{
			System.out.println("Exception : "+e.getMessage());
		}
	}
}