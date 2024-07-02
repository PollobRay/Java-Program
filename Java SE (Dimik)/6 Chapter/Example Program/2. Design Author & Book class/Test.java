class Author 
{
	private String name, email, gender;
	
	public Author()
	{
		
	}
	public Author(String n, String e, String g)
	{
		name=n;
		email=e;
		gender=g;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	public void setEmail(String n)
	{
		email=n;
	}
	public void setGender(String n)
	{
		gender=n;
	}
	
	public String getName()
	{
	return name;
	}
	
	public String getEmail()
	{
	return email;
	}
	public String getGender()
	{
	return gender;
	}
}

class Book
{
	private String name;
	private int price;
	private Author author;
	
	public Book()
	{
	}
	
	public Book(String n,int p,Author a)
	{
		name=n;
		price=p;
		author=a;
	}
	
	private void setName(String n)
	{
		name=n;
	}
	private void setPrice(int p)
	{price=p;}
	
	private void setAuthor(Author a)
	{
		author=a;
	}
	
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public Author getAuthor()
	{
		return author;
	}
}

public class Test 
{
	public static void main(String ar[])
	{
		Author author=new Author("Pollob","pollobroy97@gmail.com","Male");
		Book book=new Book("Java",550,author);
		
		System.out.println("Book name : "+book.getName());
		System.out.println("Author name : "+book.getAuthor().getName());
		System.out.println("Book price : "+book.getPrice());
		
	}
}

	
	
	