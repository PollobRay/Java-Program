//import java.util.Serializable;
import java.io.*;
import java.io.ObjectOutputStream;

class SerialDemo
{
	public static void main(String ar[]) throws Exception
	{
		
		Save obj=new Save();
		obj.i=4;
		
		File f=new File("Obj.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj1=(Save) ois.readObject();
		System.out.println("Value of "+obj1.i);
	}
}

class Save implements Serializable  // it is marker interface
{
	int i;
}
