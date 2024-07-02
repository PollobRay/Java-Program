class Test
{
	static int cube(int x) // here create static method
	{
		return(x*x*x);
	}
}
class Main
{
	public static void main(String[] args) {
		
	int res;
	res=Test.cube(5);// here call Static method & access Direct
	System.out.println("Cube of 5 is :"+res);
	}
}