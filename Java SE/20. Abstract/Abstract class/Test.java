abstract class A
{
	//code
}
class B extends A
{
	//code
}
public class Test
{
	public static void main(String ar[])
	{
		B ob1=new B(); // create class B object
		A obj2=new B(); // create class B object
	}
}

/*
		A ob = new B();
		  |		   |
reference 		 create object
variable	

Here, we create object of class B and it store reference variable
of class A.
but now only access member of class A.
*/	  