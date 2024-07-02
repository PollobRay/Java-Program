/*
	
			1	1	1	1					1
		1+ - + - + - + - +............... + - =?  where n=100
			2	2	3	4					n
		*/
		

		class Example
		{
			public static void main(String[] ar)
			{
				float sum=0;
				
				
				for(int a=2; a<=100; a++)
				{
					sum+=1/a;
					//System.out.println(sum);
				}
				
				System.out.println(sum);
			}
		}
		