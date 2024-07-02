import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Example {  
    public static void main(String[] args) {  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
    }  
}  