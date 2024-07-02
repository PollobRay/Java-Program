class Test
{
	public static void main(String[] args) 
	{
		StringBuffer str=new StringBuffer("I You");
		System.out.println("String : "+str);
		str.append(" Girl");
		System.out.println("After using append() string : "+str);
		str.insert(2," Like ");
		System.out.println("After using insert() at index no 2, String is: "+str);	
	}
}