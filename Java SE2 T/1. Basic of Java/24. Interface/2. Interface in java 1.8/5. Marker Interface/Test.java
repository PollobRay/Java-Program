interface I
{
}

class Test implements I 
{
	public void show()
	{
		System.out.println("Hello");
	}
	
	public static void main(String ar[])
	{
		
		Test obj=new Test ();// this object refer 'I' indirectly
		
		if(obj instanceof I)
			obj.show();
		else
			System.out.println("No Permission");
	}
}
