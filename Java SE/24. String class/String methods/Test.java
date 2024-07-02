class Test
{
	public static void main(String args[])
	{
		String s1="Computer";
		String s2=s1.toUpperCase();
		System.out.println(s2);
		s2=s1.toLowerCase();
		System.out.println(s2);

		int i=s1.indexOf('m'); //2
		int j=s1.indexOf('m',3); //-1
		int k=s1.indexOf("uter"); //4
		int l=s1.indexOf("uter",2);//4
		int m=s1.lastIndexOf('m');//2
		int n=s1.lastIndexOf('m',6); //2
		int o=s1.lastIndexOf("mp");//2
		int p=s1.lastIndexOf("mp",1);//-1
	}
}