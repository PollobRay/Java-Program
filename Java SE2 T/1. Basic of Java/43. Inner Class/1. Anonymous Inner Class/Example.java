
class B 
{
	public void show()
	{
		System.out.println("Hello");
	}
}

public class Example
{
	public static void main(String ar[])
	{
		B ob=new B()
		{
			public void show()
			{
				System.out.println("Hi");
			}
		};
		
		ob.show();
	}
}

		