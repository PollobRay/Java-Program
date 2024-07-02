public class Example
{
	public static void main(String ar[])
	{
		StudentDAO dao=new StudentDAO();
		Student s1=new Student();
		
		s1.rollno=15;
		s2.sname="Pollob";
		
		dao.coonect();
		dao.addStudent(s1);
		
		Student s2=dao.getStudent(12); //12 is roll no
		System.out.println(s2.sanme);
	}
}

class Student
{
	int rollno;
	String sname;
}

class StudentDAO
{
	
	Connection con=null;
	
	public void coonect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost/pollob","root","");
		}
		catch(Exception e)
		{
		}
	}
	
	public Student getStudent(int rollno)
	{
		try{
			Student s=new Student();
			s.rollno=rollno;
			
			String query="select sname from Student where rollno="+rollno;
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			rs.next();
			String name=rs.getString(1);
			s.sname=name;
			return s;
		}
		catch(Exception e)
		{
		}
		
	}
	
	public void addStudent(Student s)
	{
		String query="insert into Student values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,s.rollno);
		pst.setString(2,s.sname);
		
		int cout=pst.executeUpdate();
	}
}

