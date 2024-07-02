class Test
{
	public static void main(String ar[])
	{
		// Reference variable of 2D array
		int arr[][];

		// creating 2D array
		int ar1[][]=new int [4][5];
		// but
	/**
		int [][]a=new int[][] // error
		int [][]a=new int[][5] //error
		int [][]a=new int[4][]  // currect
		*/

		// initializing array
		int a[][]=new int[][] {{3,4},{5,6},{7,8}};
		/**  but
		int [][]a=new int[4][]
		System.out.println(a[0][0]); //Error
		System.out.println(a[0]); // 0
		System.out.println(a[0].length); //Error
		*/

		int ar2[][]=new int [4][];
		a[0]=new int[5];
		a[1]=new int[3];

		System.out.println(a[0][1]); 

	}
}