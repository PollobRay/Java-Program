class Nesting
{
	int m,n;
	Nesting(int x, int y)
	{
		m=x;
		n=y;
	}


	int largesrt()
	{
		if(m>n)
		{
			return(m);
		}
		else
		{
			return(n);
		}

		void disp() // nesting method
		{
			int ans=largesrt();
			System.out.println("Largest Value :"+ans);
		}
	}
}

class Test
{
	public static void main(String[] args) {
		
		Nesting obj=new Nesting(10,5);
		obj.disp();
	}
}