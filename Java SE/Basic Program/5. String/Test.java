class Test
{
	public static void main(String ar[])
	{
		String s="Pollob Roy PCroy";
		char ch=s.charAt(0); //p

		int v=s.codePointAt(0); // return unicode of P
		String s1=s.replace("l","L");

		String[] s3=s1.split(" ");
		for(String s2:s3)
			System.out.println(s2);
	}
}