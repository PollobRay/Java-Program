class Test
{
	public static void main(String ar[])
	{
		int d=15;
		String binary=Integer.toBinaryString(d);
		String octal=Integer.toOctalString(d);
		String hex=Integer.toHexString(d);
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hex);
		System.out.println();
	}
}