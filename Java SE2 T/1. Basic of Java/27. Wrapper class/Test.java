class Test 
{
	public static void main(String ar[])
	{
	int i=5;
	Integer i1=new Integer(i);// Boxing
	Integer j1=i;				// AutoBoxing
	int j=j1.intValue();		// UnBoxing
	int k=j1;				//AutoUnBoxing
}
}