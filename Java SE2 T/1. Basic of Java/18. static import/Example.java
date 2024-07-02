package test;

import static java.lang.System.out; // becouse 'out' is static reference
// also
import static test.Test.show;  // print is static method 

class Example
{
	public static void main(String ar[])
	{
		out.println("Hello");
		show();
	}
}