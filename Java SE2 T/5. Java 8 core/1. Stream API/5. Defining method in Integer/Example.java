/*
	Defining methods in Interface using 'default' keyword.
	it introduced in java 8.
	*/

interface Actor
{
	void act();
	void speak();
	
	default void comedy() 
	{
		/*
		this method not have to override in implementation class
		becouse it have definition here
		*/
		
		System.out.println("I can make Laugh");
	}
}

class Hero implements Actor
{
	public void act()
	{
		System.out.println("I can Act");
	}
	
	public void speak()
	{
		System.out.println("I can speak");
	}
}

class Villain implements Actor
{
	public void act()
	{
		System.out.println("I can Act");
	}
	
	public void speak()
	{
		System.out.println("I can speak");
	}
	
	public void rude()
	{
		System.out.println("I'm Rude");
	}
}

public class Example
{
	public static void main(String ar[])
	{
		Hero h=new Hero();
		h.act();
		h.comedy();
		
		Villain v=new Villain();
		v.rude();
	}
}

