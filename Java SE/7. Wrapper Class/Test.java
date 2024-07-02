public class Test
{
	public static void main(String[] ar)
	{

		Integer i1=Integer.valueOf("123");
		Integer i2=Integer.valueOf("101011",2); //binary value    here we convert binary to integer. 
												// here 2 is base of binary.

		Double d1=Double.valueOf("3.14");
		int a=Integer.parseInt("222");
		double d=Double.parseDouble("13.45");

		int c=i1.intValue();


		System.out.println(" i1 : "+i1); 
		System.out.println(" i2 : "+i2);
		System.out.println(" d1 : "+d1);
		System.out.println(" a : "+a);
		System.out.println(" d : "+d);
		System.out.println(" c : "+c);
	}
}