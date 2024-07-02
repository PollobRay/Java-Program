class Rectangle
{
	int length,width,res;
	Rectangle(int x,int y)
	{
		length=x;
		width=y;
	}
	void rectArea()
	{
		res=length*width;
		System.out.println("Area of a Rectangle is:"+res);
	}
}
class Test
{
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(10,20);
		obj.rectArea();
	}
}