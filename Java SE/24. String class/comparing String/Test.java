class Test
{
	public static void main(String args[])
	{
		String s1=new String("Compare");
		String s2=new String("compare");
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true

		String s3="coMputer"; // M=77
		String s4="compare"; //  m=109     // 77-109
		int i=s3.compareTo(s4);
		if(i==0)
			System.out.println("String are same");
		else if(i>0)
			System.out.println("Opposite to Distinary order");
		else
			System.out.println("Distinary order"); // will run
		
	}
}