package inc.roy;

import java.lang.reflect.Method ;



public class ReflectionDemo
{
	public static void main(String ar[]) throws Exception
	{
		Class<?> c=Class.forName("inc.roy.Test");
		Test t=(Test) c.newInstance();
		
		Method m=c.getDeclaredMethod("hello");// c.getDeclaredMethod("hello",null) hello is method name & null is parameter
		m.setAccessible(true);
		m.invoke(t); // m.invoke(t,null);
	}
}
