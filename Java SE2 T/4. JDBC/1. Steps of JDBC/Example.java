import java.sql.*; //1
class Example
{
	public static void main(String ar[])
	{
		Class forName("com.mysql.jdbc.Driver");// 2
		Connection con=DriverManager.getConnection("jdbc:mysql://lacalhost:3306//student","root","");//3
		
		Statement st=con.createStatement();// 4
		
		ResultSet rs=st.executeQuery("select * from std"); //5
		
		while(rs.next())
		{
		int roll=getInt(1);
		}
		st.close();
		con.close();
	}
}

		