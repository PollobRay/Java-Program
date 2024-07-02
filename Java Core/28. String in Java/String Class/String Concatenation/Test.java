class Test
{
	public static void main(String[] args) 
	{
		/*
			i) By '+' Operator
			ii) By concat() method

		*/

		String str1="Java"+" SE";
		String str2=str1+" By Oracle";
		String str3=str1+str2;
		System.out.println("String : "+str3);

		int no=10;
		String str4="Java";
		String str5=no+str4;//10java
		String str6=str4+no+2;//Java102
		String str7=no+2+str4;//12Java
		System.out.println(str4+"\n"+str5+"\n"+str6+"\n"+str7);

		// Concat method

		String str8="Java EE";
		String str9=str8.concat(" Programming");
		String str10="Oracle ".concat(str9);
		System.out.println(str8+"\n"+str9+"\n"+str10);
	}
}