
enum Mobile
{
	APPLE(100),HTC(90),SAMSUNG; // CALL PARAMETERIZE CONSTRUCTOR; // you can put ';' semicolon or not it's does not matter; // called default constructor
	
	
	
	int price;
	
	Mobile()
	{
		price=80;
		System.out.println("Constructor");
	}
	
	Mobile(int p)
	{
	price=p;
	}

	public int getPrice()
	{
		return price;
	}
	
}

public class Example
{
	public static void main(String ar[])
	{
		System.out.println(Mobile.APPLE.getPrice());
		
		Mobile m[]=Mobile.values(); //fetch all constructor
		for(Mobile mb:m)
		{
			System.out.println(mb);
		}
	}
}

	