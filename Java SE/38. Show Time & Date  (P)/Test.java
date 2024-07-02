import java.util.Date;
import java.text.*;
import java.util.*;

//mport java.util.SimpleDateFormat;

class Test
{
	public static void main(String arg[])
	{

		Date date=new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		//System.out.println(date.getMounth()+1); // because mounth start from 0 it means 0=january
		System.out.println(date.getYear());// here year from 1900
		System.out.println(1900+date.getYear()); //here we get actual year
		System.out.println(date.getHours());

		//SimpleDateFormat sdf=new SimpleDateFormat(E);
		//System.out.println(sdf.format(date));
	}
}