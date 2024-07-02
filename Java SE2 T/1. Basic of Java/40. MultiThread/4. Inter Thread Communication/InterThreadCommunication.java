class Q
{
	int num;
	boolean valueSet=false;
	
	public synchronized void put(int num)
	{
		while(valueSet)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		
		System.out.println("Put :"+num);
		this.num=num;
		valueSet=true;
		notify(); // it will enable Thread 2
	}
	
	public synchronized void get()
	{
		while(!valueSet)
		{
			try{
				wait();
			}
			catch(Exception e)
			{
			}
		}
		
		System.out.println("Get :"+num);
		valueSet=false;
		notify(); // it will enable Thread 1
	}
	
}


class Producer implements Runnable
{
	Q q;
	
	public Producer(Q q)
	{
		this.q=q;
		
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	
	public void run()
	{
		int i=0;
		
		while(true)
		{
			q.put(i++);
			try{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	
	public Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
			try{
				Thread.sleep(500);
			}
			catch(Exception e){}
		}
	}
}



public class InterThreadCommunication
{
	public static void main(String ar[])
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}

		
	