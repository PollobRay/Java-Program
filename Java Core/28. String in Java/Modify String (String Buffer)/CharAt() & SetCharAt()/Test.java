class Test
{
	public static void main(String[] args) 
	{
		StringBuffer str1=new StringBuffer("Java");
		System.out.println("String is : "+str1);

		char a;
		a=str1.charAt(0); //J
		System.out.println("Getting the Character from String '"+str1+"' using CharAt() index no 0 value is: "+a);

		str1.setCharAt(1,'A');
		System.out.println("Modify String at index no 1 from 'a' to 'A' using SetCharAt() : "+str1);//JAva

	}
}