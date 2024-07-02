import java.io.*;
import java.util.Properties ;
class Test 
{
	public static void main(String ar[])throws Exception
	{
		// store
		Properties p=new Properties();
		
		OutputStream os=new FileOutputStream("dataconfig.properties");
		p.setProperty("url","localhost:3306/myDB");// here url is key and localhost:3306/myDB is data
		p.setProperty("uname","Pollob");
		p.setProperty("password","12345");
		
		p.store(os,null);
		
		
		// Read
		InputStream is=new FileInputStream("dataconfig.properties");
		p.load(is);
		
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("url"));
		
		p.list(System.out);
	}
}
