import java. net. InetAddress;
class GetIp{
public static void main(String args[]) throws Exception {
InetAddress inetAddress = InetAddress. getLocalHost();
System.out.println("IP Address-"  + inetAddress. getHostAddress());
System.out.println("Host Name- "+ inetAddress. getHostName());
}
}