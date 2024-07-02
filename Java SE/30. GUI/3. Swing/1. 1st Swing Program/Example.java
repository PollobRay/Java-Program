import javax.swing.*;

public class Example extends JFrame
{
	
	public Example()
	{

	}
	public Example(String a)
	{
		super(a);
	}

		

	public static void main(String args[])
	{

		JLabel l1,l2,l3,l4;
		JTextField t1,t2;
		JButton b1;

		Example jf=new Example("Example");
		//jf.setComponents();
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1=new JLabel("Aditional of two Number");
		l2=new JLabel("Enter First Number :");
		l3=new JLabel("Enter Second Number :");
		l4=new JLabel();

		t1=new JTextField();
		t2=new JTextField();

		b1=new JButton("Add");

		jf.setLayout(null);

		l1.setBounds(50,50,200,20);
		l2.setBounds(50,80,100,20);
		t1.setBounds(150,80,100,20);
		l3.setBounds(50,130,100,20);
		t2.setBounds(150,130,100,20);
		b1.setBounds(80,180,100,20);
		l4.setBounds(50,240,200,20);

		jf.add(l1);
		jf.add(l2);
		jf.add(l3);
		jf.add(l4);
		jf.add(t1);
		jf.add(t2);
		jf.add(b1);
		
	}


}