import java.io.File;
import java.io.IOException;

public class Test
{
	public static void main(String []args) throws IOException
	{
		File f1=new File("./file.txt");
		System.out.println("Is exists : "+f1.exists());
		f1.createNewFile();
		System.out.println("Is exists : "+f1.exists());
		System.out.println("Length is : "+f1.length());
		System.out.println("Can file read : "+f1.canWrite());
		System.out.println("File name : "+f1.getName());
		f1.delete();
		System.out.println("Is exists : "+f1.exists());
		

	}
}