import java.util.Scanner;

public class Array
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size :");
		int n=sc.nextInt();
		int mark[]=new int[n];

		System.out.println("Array size :"+mark.length);
		System.out.println("Enter "+n+" Element");

		for(i=0; i<mark.length; i++)
		{
			mark[i]=sc.nextInt();
		}

		System.out.println("Your value are:");

		for(i=0; i<n; i++)
		{
			System.out.println(mark[i]);
		}
	}
}