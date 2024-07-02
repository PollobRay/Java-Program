import java.io.File;

class Test
{
	public static void main(String ar[])
	{
		File dir=new File("./Folder");
		dir.mkdir();
		String path=dir.getAbsolutePath();

		System.out.println(path);
	}
}