import java.util.*;
import java.io.*;
import java.beans.XMLEncoder ;

public class SerializeXML 
{
	public static void main(String ar[])throws Exception
	{
		Student s1=new Student();
		s1.setRoll(101);
		s1.setName("Pollob");
		
		Student s2=new Student();
		s2.setRoll(102);
		s2.setName("Roy");
		
		List<Student> s=new ArrayList<> ();
		s.add(s1);
		s.add(s2);
		
		College c=new College();
		c.setStudent(s);
		
		XMLEncoder xml=new XMLEncoder(new BufferedOutputStream (new FileOutputStream("mycollege.xml")));
		xml.writeObject(c);
		xml.close();
	}
}