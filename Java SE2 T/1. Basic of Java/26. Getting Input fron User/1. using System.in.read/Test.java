class Test 
{
	public static void main(String ar[]) throws Exception
	{
		// int i=System.in.read(); // it get an one character and return ASCII of it.
		String str="";
		int i;
		while((i=System.in.read())!=48) // for enter
		{
			str =str+(char) i;
		}
		System.out.println(str);
	}
}
