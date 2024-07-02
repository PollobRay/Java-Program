import java.awt.*;
import java.applet.Applet;
import java.util.*;

public class MyApplet extends Applet implements Runnable
{
	Thread t1,t;

	public void start()
	{
		//Thread t;
		t=new Thread(this);
		t.start();
	}

	public void run()
	{
		t1=Thread.currentThread();// it return current thread

		while(t1==t)
		{
			repaint(); //call Paint() method

			try
			{
				t1.sleep(1000);
			}
			catch(InterruptedException e)
			{

			}
		}
	}

	public void paint(Graphics g)
	{
		Calendar c=new GregorianCalendar();
		String h,m,s;
		h=String.valueOf(c.get(Calendar.HOUR));
		m=String.valueOf(c.get(Calendar.MINUTE));
		s=String.valueOf(c.get(Calendar.SECOND));

		g.drawString(h+":"+m+":"+s,20,30);
	}
}