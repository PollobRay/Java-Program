import java.util.Scanner;
import java.lang.*;

class Account
{
	private int bal;
	public Account(int bal)
	{
		this.bal=bal;
	}

	public boolean isSufficientBalance(int w)
	{
		if(bal>w)
			return(true);
		else
			return(false);

	}

	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("Withdral money is :"+amt);
		System.out.println("Your current balance is : "+bal);
	}

}

class Customer implements Runnable
{
	private String name;
	private Account actobj;

	public Customer(Account actobj,String n)
	{
		this.actobj=actobj;
		name=n;
	} 
	public void run()
	{
		Scanner kb=new Scanner(System.in);

		 synchronized (actobj)
		{
		
			System.out.println(name+" Enter amount to withdraw amount : ");
			int amt=kb.nextInt();

			if(actobj.isSufficientBalance(amt))
			{
				System.out.println(name);
				actobj.withdraw(amt);
			}
			else
				System.out.println("Insufficient Balance ");
		}
	}
}

public class Test 
{
	public static void main(String ar[])
	{
		Account a1=new Account(1000);
		Customer c1=new Customer(a1,"Raj");
		Customer c2=new Customer(a1,"Pollob");

		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}