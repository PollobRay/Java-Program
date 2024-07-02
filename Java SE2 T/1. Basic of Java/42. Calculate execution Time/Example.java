// How to use currentTimeMillis of System class to calculate execution time
import java.util.*;

class Example
{
	public static void main(String ar[])
	{
		long start=System.currentTimeMillis();//return milli second from 1'st Jan 1970
		ArrayList a=new ArrayList(); 
		
		for(int i=1;i<1000000;i++)
		{
			a.add(i);
		}
		
		long end=System.currentTimeMillis();
		System.out.println("The program Execution time :"+(end+start));
	}
}