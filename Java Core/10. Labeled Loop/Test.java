class Test
{
	public static void main(String[] args) {
		int i,j;

		Loop1: for(i=1;i<11;i++)
		{
			System.out.print(" ");
			if(i==6)
			{
				break;
			}
			for(j=1;j<=5;j++)
			{
				System.out.print("*");
				if(i==j)
				{
					continue Loop1; // label Loop
				}
			}
			System.out.println("");
		}
	}
}