import java.util.Scanner;

public class Calculator
{
	public int add(int a,int b) 
	{
			return a+b;
	}
	
	public int sub(int a, int b) 
	{
	return a-b;
	}
	
	public int div(int a,int b) 
	{
	return a/b;
	}
	
	public int multi(int a,int b)
	{	
	return a*b;
	}
	
	
	
	public static void main(String ar[])
	{
		Scanner src=new Scanner(System.in);
		Calculator cal=new Calculator();
		
		int choice;
		
		do{
			System.out.println("Please Choose Option");
			System.out.println("1 for addition");
			System.out.println("2 for subtraction");
			System.out.println("3 for multiplication");
			System.out.println("4 for Division");
			System.out.println("0 for quite");
			
			choice=src.nextInt();
			System.out.println("Enter 1st Number");
			int a=src.nextInt();
			System.out.println("Enter 2nd Number");
			int b=src.nextInt();
			
			switch(choice)
			{
				case 1:
				System.out.println("Addition :"+cal.add(a,b));
				break;
				
				case 2:
				System.out.println("Subtraction :"+cal.sub(a,b));
				break;
				
				case 3:
				System.out.println("Multiplication :"+cal.multi(a,b));
				break;
				
				case 4:
				System.out.println("Division :"+cal.div(a,b));
				break;
			}
		}while(choice!=0);
}
}

				
				