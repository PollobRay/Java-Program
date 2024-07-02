import java.io.*;

class Test
{
public static void main(String ar[]) throws IOException 
{
	FileWriter fw=new FileWriter("./File.txt",true);
	BufferedWriter bf=new BufferedWriter(fw);
	bf.write("Computer");
	bf.close();
}
}