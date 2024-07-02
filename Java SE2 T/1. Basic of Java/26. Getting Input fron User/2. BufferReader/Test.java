import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Test 
{
public static void main(String ar[])throws Exception
{
System.out.println("Enter a number:");
InputStreamReader is=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(is);
String c=br.readLine();// it return String
int n=Integer.parseInt(c); 
System.out.println(n);
}
}
