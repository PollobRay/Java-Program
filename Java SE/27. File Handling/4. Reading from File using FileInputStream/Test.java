import java.io.*;

public class Test 
{
	public static void main(String ar[]) throws IOException
	{
		int i;
		FileInputStream fin=new FileInputStream("./myfile.txt");

		do{
			i=fin.read();
			if(i!=-1)
				System.out.println((char)i);
		}
		while(i!=-1);

		fin.close();
	}
}