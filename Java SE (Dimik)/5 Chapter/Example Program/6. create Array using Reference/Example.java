
interface User 
{
	String getName();
}

class DefaultUser implements User
{
	private String name;
	
	public DefaultUser(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
}

abstract class Account 
{
	private long amount;
	
	private final void deposit(long amount)
	{
		this.amount +=amount;
	}
	
	public long getAmount()
	{
		return amount;
	}
	
	public abstract long calculateInterest();
}

class SavingAccount extends Account 
{
	public SavingAccount(int i)
	{
	}
	
	public long calculateInterest()
	{
		return 0;
	}
}

public class Example
{
	public static void main(String ar[])
	{
		User[] users=new User[2];
		users[0]=new DefaultUser("Pollob");
		users[1]=null;
		
		Account[] act=new Account[2];
		act[0]=new SavingAccount(100);
		act[1]=null;
	}
}