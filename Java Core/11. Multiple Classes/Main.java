class Test
{
	int a,b,c;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		c=a+b;
		System.out.println("Addition is :"+c);
	}
}

public class Main // save file here has main function
{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.getdata(100,200);
		obj.add();
	}
}