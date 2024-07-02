class Box
{
	private int length, breadth, height;

	public void setDimension(int l, int b, int h)
	{
		length=l;
		breadth=b;
		height=h;
	}

	public void showDimension()
	{
		System.out.println("Length ="+length+"\n Breadth ="+breadth+"\n Heigth ="+height);
	}
}

public class Test
{
	public static void main(String ar[])
	{
		Box obj;
		obj=new Box();

		obj.setDimension(10,15,20);
		obj.showDimension();

		obj=new Box(); // here we create new object & consume at old refreance
		obj.showDimension(); // here show 0 0 0
							// becuse new obj is consume new object
	}
}