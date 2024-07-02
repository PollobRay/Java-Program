class Test 
{
	public static void main(String ar[])
	{
		Test t=new Test();
		System.out.println("10 is perfect :"+t.isPerfect(10));
	}
	
	public boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		
		if(n==sum)
		{
			return true;
		}
		else
			return false;
	}
}
