class Student
{
	int m1,m2;
	void Getmarks(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void Putmarks()
	{
		System.out.println("first :"+m1);
		System.out.println("Second :"+m2);
	}
}

interface Sport
{
	int sp=6;
	void Spmark();
}

class Result extends Student implements Sport
{
	public void Spmark()
	{
		System.out.println("Sports marks :"+sp);
	}

	void Disp()
	{
		Putmarks();
		Spmark();

		int total=m1+m2+sp;
		System.out.println("Total :"+total);
	}
}

class Test
{
	public static void main(String[] args) {
		
		Result obj=new Result();
		obj.Getmarks(80,40);
		obj.Disp();
	}
}