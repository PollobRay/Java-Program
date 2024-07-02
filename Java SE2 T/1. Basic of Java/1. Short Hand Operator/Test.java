class Test
{
public static void main(String ar[])
{
	byte b=8;
//	b=b*2.5; // Have Error
	b*=2.5; // T(E1) op E2/ b*2.5
	System.out.println(b);
}
}