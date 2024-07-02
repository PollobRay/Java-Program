import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test 
{

	private Container c;
	private JButton btn1,btn2,btn3;
	private CardLayout cl; 
	JFrame frame;

	Test()
	{

	initc();	

	}

	public void initc()
	{

		frame=new JFrame();
		frame .setSize(500,500);
		frame.setTitle("Flow Layout");
		c=frame.getContentPane();
		cl=new CardLayout(); 
		frame.setVisible(true);

		c.setLayout(cl);

		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		
		c.add(btn1,"first");
		c.add(btn2,"second");
		c.add(btn3,"third");

		cl.show(c,"third");

		
		class Handler implements ActionListener
		{

		
		public void actionPerformed(ActionEvent e)
		{
			cl.next(c);
			// cl.previous(c);
			// cl.first(c);
			//cl.last(c);
		}
		}

		Handler h=new Handler();

		btn1.addActionListener(h);
		btn2.addActionListener(h);
		btn3.addActionListener(h);

	}

	public static void main(String[] args) {
		
		Test t=new Test();
		

	}
}