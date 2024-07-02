public class Student
{
	private int rollno;
	private String sname;
	
	public void setRoll(int roll)
	{
		rollno=roll;
	}
	public void setName(String n)
	{
		sname=n;
	}
	
	public int getRoll()
	{
		return rollno;
	}
	
	public String getName()
	{
		return sname;
	}
	
	public String toString()
	{
		return "Student    rollno:"+rollno+"  Student name:"+sname;
	}
	
}