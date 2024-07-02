class Test
{
	public static void main(String[] args)
	{
	
		/*
		syntax:
		-------
		StringBuffer str=new StringBuffer("String");

		*/	

		StringBuffer str1= new StringBuffer("Java");
		int length, capacity;
		length=str1.length(); //4
		capacity=str1.capacity();// 4 + 16  =20
						//			|	|
						//	   length  Default
		System.out.println("Length of "+str1+" is : "+length+"\n Capacity of "+str1+" is : "+capacity);
		int l,c;
		

		StringBuffer str2= new StringBuffer(10);
		l=str2.length(); // 0       but here no string
		c=str2.capacity();// 10     It's that we give value when create str2 object & set 10
		System.out.println("Length of "+str2+" is : "+l+"\n Capacity of "+str2+" is : "+c);

	}
}