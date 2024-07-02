class Box
{
	private int l,b,h;

	public void setDimension(int l, int b, int h)
	{
		this.l=l; // access instance variable
		this.b=b;
		this.h=h;
	}

	public void sendBox()
	{
		// GiftTaker gf=new GiftTaker();
		// gf.acceptGift(this);    // here this point current object
	}
}

public class Example{
	public static void main(String ar[])
	{
		Box b=new Box();
		b.setDimension(12,10,5);
		b.sendBox();
	}
}