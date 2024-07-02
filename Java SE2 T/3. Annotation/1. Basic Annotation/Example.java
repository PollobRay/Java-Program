
import java.util.ArrayList;
// Annotation is introduced in java 1.5

@FunctionalInterface // It make your interface Functional.If it not it give you Error 
interface I
{
	void show();
}

class A 
{
	public void show()
	{
		System.out.println("A");
	}
}

class B extends A 
{
	
	@Deprecated // it say not use the method because it will remove next version.
	public void show2()
	{
	}
	
	@Override
	@SuppressWarnings("unchecked") // Abovide all unchecked waring.
	public void show()
	{
		ArrayList ob=new ArrayList();
		
		System.out.println("B");
	}
}

public class Example
{
	public static void main(String ar[])
	{
		B ob=new B();
		ob.show();
	}
	
}

