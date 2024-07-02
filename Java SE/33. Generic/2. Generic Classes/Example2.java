package generic;

public class Example2 <D1, D2>
 {

D1 i;
D2 j;

public void set(D1 r,D2 n)
{
 i=r;
 j=n;
}

public D1 get1()
{
  return(i);
}
public D2 get2()
{
  return(j);
}

}
