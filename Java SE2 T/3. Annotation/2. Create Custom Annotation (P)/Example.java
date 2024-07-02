/*
when we create our own annotation, it will implement Annotation interface, it bydefault.
*/

@Inherited // it will available for Inherited class
@Documented // we can create documentation of it.
@Target(ElementType.TYPE) // what level we'll be using this annotation // TYPE is class, we can use class or interface
@Retention(RetentionPolicy.RUNTIME) // It will be available for Runtime						
@interface SmartPhone
{
	String os() default "Linux"; // default value of os
	int version() default 1;
}

@SmartPhone(os="Android", version=6) // here we override the default value
class NokiaSeries
{
	String model;
	int size;
	
	public NokiaSeries(String model, int size)
	{
		this.model=model;
		this.size=size;
	}
}

class Na extends NokiaSeries // here available the annotation
{

}

public class Example
{
	public static void main(String ae[])
	{
		NokiaSeries obj=new NokiaSeries("Fire",5);
		
		Class c=obj.getClass();
		
		Annotation an=c.getAnnotation(SmartPhone.class); // create annotation object 
		
		SmartPhone s=(SmartPhone) an;
		
		System.out.println(s.os());
	}
	
}

