import java.io.*;
class Test 
{
	public static void main(String ar[]) throws Exception 
	{
		FileOutputStream fos=new FileOutputStream("demo.txt");
		
		DataOutputStream dos=new DataOutputStream(fos);
		
		dos.writeUTF("Demo contemt");
		
		FileInputStream fis=new FileInputStream("demo.txt");
		DataInputStream dis=new DataInputStream(fis);
		String line=dis.readUTF();
		
		System.out.println(line);
	}
}
