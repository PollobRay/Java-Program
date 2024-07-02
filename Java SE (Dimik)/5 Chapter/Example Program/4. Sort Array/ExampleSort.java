class ExampleSort
{
	int myArray[]=new int[]{4,2,5,9,46,3,7,5,0};
	
	public void sort()
	{
		for(int i=0; i<myArray.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(myArray[i]<myArray[j])
				{
					int temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
				}
			}
		}
		
	}
	
	public static void main(String ar[])
	{
		ExampleSort es=new ExampleSort();
		
		for(int i:es.myArray)
		{
			System.out.println(i);
		}
		
		es.sort();
		System.out.println();
		System.out.println();
		for(int i:es.myArray)
		{
			System.out.println(i);
		}
		
	}
}

		
		
		