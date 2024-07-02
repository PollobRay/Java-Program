class Test
{
	public static void main(String ar[])
	{
		Integer y=Integer.valueOf(10);
		int x=10;
		Integer z=x; // Integer.valueOf(x)   automatic    (Autoboxing)
		Double d=new Double(10.25);
		double e=d.doubleValue(); //unboxing
	}
}