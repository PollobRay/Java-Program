import java.io.*;

public class Test 
{
	public static void main(String args[])throws IOException
	{
		int i;
		FileOutputStream fout;
		fout=new FileOutputStream("./myfile.txt",true); // "./" means current folder & "../" means child folder
		String s="Tata";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++)
			fout.write(ch[i]);

		fout.close();

	}
}