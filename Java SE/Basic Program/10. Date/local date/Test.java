 import java.time.LocalDate;  
class Test
{
	public static void main(String ar[])
	{
		  
    
        LocalDate date = LocalDate.now();  
        LocalDate yesterday = date.minusDays(1);  
        LocalDate tomorrow = yesterday.plusDays(2);  
        System.out.println("Today date: "+date);  
        System.out.println("Yesterday date: "+yesterday);  
        System.out.println("Tommorow date: "+tomorrow);  
    
	}
}