public class Box
{
	private int l,b,h;

	public Box()
	{
		l=10;
		b=8;
		h=4;
	}

	public Box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}

	public static void main(String ar[])
	{

		Box b1=new Box();
		Box b2=new Box(20,15,25);

		
	}

}