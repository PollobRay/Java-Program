public class Lograthim
{
	public static void main(String ar[])
	{
		System.out.println("\n\t log10(n) \t log2(n) \t loge(n)");
		int n=1;
		while(n<=10)
		{
			double log10=Math.log10((double)n);
			double log2=Math.log2((double)n);
			double loge=Math.loge((double)n);
			
			String row=String.format("%d :"+"\t %.6f"+"\t %.6f"+"\t %.6f",n,log10,log2,loge);
			System.out.println(row);
			n++;
		}
	}
}
		