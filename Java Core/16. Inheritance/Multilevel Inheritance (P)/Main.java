class Student
{
	int roll;
	void Getdata(int x)
	{
		roll=x;
	}
	void Putdata()
	{
		System.out.println("Roll :"+roll);
	}
}

class Test extends Student
{
	int m1,m2;
	void Getmark(int x,int y)
	{
		m1=x;
		m2=y;
	}
	void Putmark()
	{
		System.out.println("Test 1 :"+m1);
		System.out.println("Test 2 :"+m2);
	}
}

class Result extends Test
{
	int total;
	void Disp()
	{
		Putroll();
		Putmark();
		total=m1+m2;
		System.out.println("Toatal mark :"+total);
	}
}

class Main
{
	public static void main(String[] args) {
		Student ob=new Student();
		ob.Getroll(46);
		ob.Getmark(80,85);
		ob.Disp();
	}
}