import java.util.*;

class Student implements Comparable<Student>
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
	
	public int compareTo(Student s)
	{
		return this.mark>s.mark?-1:this.mark<s.mark?1:0;
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
		
		Collections.sort(std);
		
		for(Student s:std)
		{
			System.out.println(s);
		}
			
	}
}