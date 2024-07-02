import java.io.*;
public class Test 
{
	public static void main(String args[]) throws IOException 
									// Here we handle checked Exception in just compile
																// time but, It with show Error in Runtime
	{
		throw new IOException();

		
		System.out.println("After Exception");
	}
}