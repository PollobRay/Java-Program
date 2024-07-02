import java.util.*;

class Test
{
	public static void main(String args[])
	{

		int a[]=new int[] {20,5,50,10,25};
		int i;

		for(i=0; i<a.length; i++)
			System.out.print(a[i]+" ");

		Arrays.sort(a);
		//System.out.println(a);

		Arrays.sort(a,2,5);
		//System.out.println(a);

		Arrays.fill(a,5);
		//System.out.println(a);

		Arrays.fill(a,2,5,1);
		//System.out.println();

		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}