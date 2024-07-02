abstract class Person
{
	abstract void show(); // abstract method
}

abstract class Student extends Person
{
	// becouse it have abstract method
	// here abstract method inherite not override
}

class Teacher extends Student
{
	public void show()
	{
		System.out.println("Pollob");
	}
}

class Test
{
	public static void main(String ar[])
	{
		// Student s=new Student(); // have error we can not create object
		Teacher t=new Teacher();
		t.show();
	}
}

/**
If we not override abstract method at abstract class then the inherite will be abstract.
then we can not create object of the class.
*/