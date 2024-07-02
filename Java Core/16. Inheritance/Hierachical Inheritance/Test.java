class One
{
	int x=10, y=20;
	void Disp()
	{
		System.out.println("Method of Class one");
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
	}
}

class Two extends One
{
	void Add()
	{
		System.out.println("Method of class Two");
		System.out.println("X + Y :"+(x+y));
	}
}

class Three extends One
{
	void Mul()
	{
		System.out.println("Method of class Three");
		System.out.println("X * Y :"+(x*y));
	}
}


public class Test
{
	public static void main(String[] args) {
		
		Two obj1=new Two();
		Three obj2=new Three();

		obj1.Disp();
		obj1.Add();
		obj2.Mul();
	}
}