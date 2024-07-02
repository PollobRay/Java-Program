import java.util.Scanner;

class Test
	{
		public static void main(String ar[])
		{
			Scanner obj=new Scanner(System.in);
			int a,b,c;
			System.out.print("Enter first number :");
			a=obj.nextInt();
			System.out.print("\nEnter Second number:");
			b=obj.nextInt();
			System.out.print("\nEnter Third number:");
			c=obj.nextInt();

			if(a>b)
			{
				if(a>c)
				{
					System.out.println("Greater Number Is :"+a);
				}
				else
				{
					System.out.println("Greater Number Is :"+b);
				}
			}
			else
			{
				System.out.println("Greater Number Is :"+c);
			}
		}
	}