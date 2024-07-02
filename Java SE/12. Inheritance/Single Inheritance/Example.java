public class Example
{
	public static void main(String ar[])
	{
		Student s=new Student();
		s.setRollno(100);
		s.setName("Pollob");
		s.setAge(18);

		System.out.println("Roll no : "+s.getRollno());
		System.out.println("Name : "+s.getName());
		System.out.println("Age : "+s.getAge());
	}
}