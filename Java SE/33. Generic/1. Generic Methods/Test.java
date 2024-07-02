package generic;

public class Test {

  public static void main(String[] args) {
   Integer  a []=new Integer[]{10,20,30,40,50};
   Integer b=new Integer (100);
   
   Example1 o=new Example1();
   Example2 ob=new Example2();
   
   System.out.println("Example1 generic method :");
   o.printArray(a);
   System.out.println("\n\n Example2 generic method :");
   ob.set(b,"Pollob");
  }
}
