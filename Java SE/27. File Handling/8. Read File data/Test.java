import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Test
{
	public static void main(String sr[])
	{

		BufferedReader br=null;

		try
		{
			br=new BufferedReader(new FileReader("File.txt"));

			String line;

			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{

			try
			{
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}