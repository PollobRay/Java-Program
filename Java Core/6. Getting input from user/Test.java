import java.util.Scanner;

class Test
	{
	public static void main(String ar[])
		{
		int no;
		Scanner obj=new Scanner(System.in); // here create object of Scanner class
		System.out.println("Enter a number :");
		no=obj.nextInt();// for getting integer value
		System.out.println("Your number is :"+no);
		}
	}
/* method

	nextInt()  for integer value
	nextFloat()  for float value
	nextLine()   for String
*/