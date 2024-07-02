package generic;

import generic.Example2;


public class Test {

  public static void main(String[] args) {
  
  
  Example1<Integer> i1=new Example1<Integer>();
  Example1<String> i2=new Example1<String>();
  
  Example2<Integer,String> j1=new Example2<Integer,String> ();
  Example2<String,Integer> j2=new Example2<String,Integer>();
  
  Integer a=new Integer (40);
  Integer b=new Integer (52);
  Integer c=new Integer (59);
  
  i1.set(a);
  i2.set("Pollob");
  
  j1.set(b,"Rabbi");
  j2.set("Santo",c);
  
  
  System.out.println("Example1 i1 :"+i1.get());
  System.out.println("Example1 i2 :"+i2.get());
  
  System.out.println("Example2 j1 & get1 :"+j1.get1());
  System.out.println("Example2 j1 & get2 :"+j1.get2());
  System.out.println("Example2 j2 & get1 :"+j2.get1());
  System.out.println("Example2 j2 & get2 :"+j2.get2());
  
   
  }
}
