import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

class Test extends JFrame
{

	private Container c;
	private JButton btn1,btn2,btn3,btn4,btn5;
	private BorderLayout bLayout; // here we can make or naot becouse it is bydefault

	Test()
	{
		this .setSize(500,500);
		this.setTitle("Border Layout");
		c=this.getContentPane();
		bLayout=new BorderLayout(); // Left

		/**
		make Gap :
		bLayout =new BorderLout(10,50);
					here 10 is Horizontal Gap & 5 is Vertical Gap

		*/

		c.setLayout(bLayout);

		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");

		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.WEST);
		c.add(btn3,BorderLayout.CENTER);
		c.add(btn4, BorderLayout.EAST);
		c.add(btn5, BorderLayout.SOUTH);

		// make GAP
		bLayout.setHgap(10);
		bLayout.setVgap(5);


	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}