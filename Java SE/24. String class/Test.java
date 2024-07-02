class Test
{
	public static void main(String args[])
	{
		String s1="Computer";
		String s2="Computer";
		String s3=new String("Cmputer");

		System.out.println(s1==s2);//true  here compare string reference
		System.out.println(s1.equals(s2));// true  here compare String values
		System.out.println(s1==s3); //flase
		System.out.println(s1.equals(s3)); //true
		
	}
}