
class ExampleFibo
{
	public int fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(n>1)
		{
			return (fibo(n-1)+fibo(n-2));
		}
		return 0;
	}
	
	public static void main(String ar[])
	{
		ExampleFibo ef=new ExampleFibo();
		
		int myArray[]=new int[10];
		for(int i=0;i<10;i++)
		{
			myArray[i]=ef.fibo(i);
		}
		
		for(int i=0;i<10;i++)
		{
			
			System.out.println(myArray[i]);
		}
	}
}