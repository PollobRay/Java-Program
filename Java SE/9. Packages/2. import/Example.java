package pack1;
import pack2.Student;
public class Example
{
	public static void main(String ar[])
	{
		Student s=new Student();
		s.setRollno(46);
		s.setName("Pollob");
		System.out.println("Roll on : "+s.getRollno());
		System.out.println("Name : "+s.getName());
	}
}