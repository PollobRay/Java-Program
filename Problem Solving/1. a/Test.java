import java.util.Scanner;
class Test
{
	public static void main(String[] args) {
		
		int i,j;

		Scanner kb=new Scanner(System.in);

		i=kb.nextInt();
		String []ar=new String[i];

		for(int a=0;a<i;a++)
		{
			ar[a]=kb.next();

		}


		for(int a=0;a<i;a++)
		{
			//int b,c;
			if((j=ar[a].indexOf('+'))> -1)
			{
				String[] s=ar[a].split("+",j);
				for(String s2:s)
				{
					System.out.println(s2);
				}
			}
			

		}

		

	}
}