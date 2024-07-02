
class Student
{
	int roll;
	String name;
	
	public Student(int r,String n)
	{
		roll=r;
		name=n;
	}
	public Student()
	{
	}
	
	@Override
	public String toString() // method of Object class
	{
		return roll+"  "+name;
	}
}

public class Test 
{
	public static void main(String ar[])
	{
		Student s=new Student(10,"Pollob");
		System.out.println(s);// 10 Pollob
		/* 
		when we not override the method toString() then,
		the line print packageName,className,hasCode
		*/
	}
}