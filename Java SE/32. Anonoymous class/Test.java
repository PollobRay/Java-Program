class Greeting // outerclass
{
	public void sayHello()
	{
		System.out.println("Hello");
	}
}

class BD
{
	Greeting g=new Greeting(){ 
		/** here, we creates anonymous Inner subclass of Greating and Subclass object
		& store it Greeting reference variable
		*/

			public void sayHello() //overirde method
			{
				System.out.println("Hi");
			}

			};
}
class Test
{
	public static void main(String ar[])
	{
		BD b=new BD();
		b.g.sayHello();//call anonymous class
	}
}