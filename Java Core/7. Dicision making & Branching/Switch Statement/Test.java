import java.util.Scanner;

class Test
{
	public static void main(String arg[])
	{
		Scanner obj=new Scanner(System.in);
		int roll;
		System.out.print("Enter your roll:");
		roll=obj.nextInt();

		switch(roll)
		{
			case 101:
			{
				System.out.print("\n Pollob");
				break;
			}
			case 102:
			{
				System.out.print("\n Roy");
				break;
			}
			default:
			System.out.println("Not Found");
		}
	}
}