class Test
{
	public static void main(String[] args) {
		
		String str1="Pollob"; //using String Literal

		String str2=new String("Roy"); //using New keyword

		System.out.println(str1+" "+str2);

				//	  0   1   2   3   4   5
		char name[]={'P','o','l','l','o','b'};
		String str3=new String(name);
		System.out.println("Using Charecter Array "+str3);
		// 
		String str4=new String(name,2,3); // llo
							//      |  |
							//     /    \
					//    start point   length
		System.out.println(" "+str4);

		int vl=str1.length();
		System.out.println("Length of Str1 : "+vl);

	}
}