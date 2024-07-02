abstract class X
{
	abstract void Disp();

	void Display()
	{
		System.out.println("Method from X class");
	}
}

class Y extends X
{
	Void Disp()
	{
		System.out.println("Method from Y class");
	}
}

class Main
{
	public static void main(String[] args) {
		
		Y obj=new Y();
		obj.Disp();
		obj.Display();
	}
}