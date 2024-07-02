class Test
{
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="hello";
		String str3="Hello";
		String str4="hello";

		boolean a,b,c,d;
		a=str1.equals(str2);// false
		c=str1.equals(str3);//true
		b=str1.equalsIgnoreCase(str2); // true
		d=str2.equalsIgnoreCase(str4);//false

		System.out.println(str1+" & "+str2+" in equal() : "+a);
		System.out.println(str1+" & "+str3+" in equal() : "+c);
		System.out.println(str1+" & "+str2+" in equalsIgnoreCase() : "+b);
		System.out.println(str2+" & "+str4+" in equalsIgnoreCase() : "+d);
	}
}