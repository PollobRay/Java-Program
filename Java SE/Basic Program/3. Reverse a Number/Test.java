class Test
{
	public static void main(String ar[])
	{

		int num, sum=0, temp,r;
		temp=25;

		while(temp !=0)
		{
			r=temp%10;
			sum=sum*10+r;
			temp=temp/10;
		}

		System.out.println(sum);
	}
}