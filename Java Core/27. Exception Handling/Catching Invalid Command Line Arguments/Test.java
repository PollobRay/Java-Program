class Test
{
	public static void main(String[] args) {
		
		int valid=0, invalid=0;
		int no;
		for(int i=0; i<args.length;i++)
		{
			try
			{
				no=Integer.parseInt(args[i]);// here convert value string to integer
											// becuse command line argument return string value
			}
			catch(NumberFormatException e) // here e is object
			{
				invalid=invalid+1;
				System.out.println("Invalid = "+args[i]);
				continue;
			}
			valid=valid+1;
		}

		System.out.println("Valid Number : "+valid);
		System.out.println("Invalid number : "+invalid);
	}
}