class Test
{
	public static void main(String ar[])
	{
		int[] arr1= new int[5];
		int arr2[]=new int[5];

		int arr3[]=new int[] {2,4,6,8,10,12};
		// int arr3[]=new int[6]{2,4,6,8,10,12}; // error
													// you can not memtion size and values together
		//arr2[] = { 1, 2, 3, 4, 5 } ;


		int arr4[];
		arr4=new int[3];
		arr4[0]=10;
		arr4[1]=20;
		arr4[2]=30;


		for(int i=0; i<arr3.length; i++)
			System.out.print(arr3[i]+"  ");
//
		//for(int i=0; i<arr2.length; i++)
		//	System.out.print(arr2[i]+"  ");

		for(int i=0; i<arr4.length; i++)
			System.out.print(arr4[i]+"  ");
	}
}