import java.sql.*; //1
class Example
{
	public static void main(String ar[])
	{
		Class forName("com.mysql.jdbc.Driver");// 2
		Connection con=DriverManager.getConnection("jdbc:mysql://lacalhost:3306//student","root","");//3
		
		String query="insert into student values(?,?);
		String uname="Pollob";
		int roll=46;
		
		PreparedStatement st=con.prepareStatement(query);// 4
		
		st.setString(1,uname);
		st.setInt(2,roll);
		
		int count=st.executeUpdate(); //5
		
		System.out.println(count+" rows sre affected");
		
		st.close();
		con.close();
	}
}
