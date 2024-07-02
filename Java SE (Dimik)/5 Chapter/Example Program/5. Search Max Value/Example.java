class Example
{
	public static void main(String ar[])
	{
		int myArray[]=new int[]{5,49,10,64,3,9};
		int max=myArray[0];
		for(int i=1; i<myArray.length; i++)
		{
			if(max< myArray[i])
				max=myArray[i];
		}
		System.out.println(max);
	}
}