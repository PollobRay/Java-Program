interface Perser
{
	String parse(String str);
}

class StringParser
{
	public String convert(String s)
	{
		if(s.length() <=3)
			s=s.toUpperCase();
		else
			s=s.toLowerCase();
		
		return s;
}}

class MyPrinter
{
	public void print(String str,Perser p)
	{
		str=p.parse(str);
		System.out.println(str);
	}
}

public class Example
{
public static void main(String ar[])
{
	StringParser sp=new StringParser();
	
	String str="Pollob";
	
	MyPrinter mp=new MyPrinter();
	mp.print(str,(sp::convert));
}
}

