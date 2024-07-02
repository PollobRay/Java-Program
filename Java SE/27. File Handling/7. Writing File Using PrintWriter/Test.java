import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Test
{
	public static void main(String arg[])
	{

		try
		{
			File file=new File("./file.txt");

			if(!file.exists())
			{
				file.createNewFile();
			}

			PrintWriter pw=new PrintWriter(file);
			pw.println("This the first program"); // here we write the line in text program
			pw.println(1000);

			pw.close();

			System.out.println("Done");

		}

		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}