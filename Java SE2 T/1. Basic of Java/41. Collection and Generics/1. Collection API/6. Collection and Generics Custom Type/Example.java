import java.util.*;
class Student
{
	int rollno;
	int mark;
	
	public Student(int r,int m)
	{
		rollno=r;
		mark=m;
	}
	
	public String toString()
	{
		return "Student   roll: "+rollno+"  Mark: "+mark;
	}
}

public class Example
{
	public static void main(String ar[])
	{
		List<Student> std=new ArrayList<> ();
		std.add(new Student(2,80));
		std.add(new Student(5,90));
		std.add(new Student(10,95));
		
		Collections.sort(std,(s1,s2) ->
		{
			return s1.mark> s2.mark?-1:s1.mark<s2.mark?1:0;
		});
		for(Student s:std)
		{
			System.out.println(s);
		}
			
	}
}
	