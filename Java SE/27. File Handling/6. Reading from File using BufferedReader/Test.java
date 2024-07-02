import java.io.*;
public class Test
{
	public static void main(String ar[]) throws IOException
	{
		int ch;
		BufferedReader bf=new BufferedReader(new FileReader("file.txt"));

	//	int read():
		while((ch=bf.read())!=-1)
		{
			System.out.print((char)ch);
		}


	// void read(char[],int index, int length)
		char[] s=new char[20];
		bf.read(s,0,10);//s= destiniation array
		System.out.println("\n "+s);


	// String readLine()
		String s1;
		while((s1=bf.readLine())!=null)
			System.out.println(s1);

		bf.close();
	}
}