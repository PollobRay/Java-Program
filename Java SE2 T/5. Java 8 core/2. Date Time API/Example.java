import java.time.*;
class Example
{
	public static void main(String ar[])
	{
		LocalTime t=LocalTime.now();
		LocalTime t1=LocalTime.now(ZoneId.of("GMT"));
		LocalDateTime d=LocalDateTime.now();
		
		System.out.println(t+" \n"+t1+"\n"+d);
	}
}
