class Test
{
	public static void main(String[] args) 
	{
		StringBuffer str1=new StringBuffer("Pollob");
		System.out.println("String :"+str1);
		str1.delete(2,4);
		System.out.println("After delete String index 2 to 4 "+str1);
		str1.deleteCharAt(0);
		System.out.println("Again Delete character at index 0 "+str1);	
	}
}