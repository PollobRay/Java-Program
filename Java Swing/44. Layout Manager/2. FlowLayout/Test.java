import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

class Test extends JFrame
{

	private Container c;
	private JButton btn1,btn2,btn3,btn4,btn5;
	private FlowLayout fLayout; // It defualt Laout of JPanel
	// It arrange the componects in a row, one after another row

	Test()
	{
		this .setSize(500,500);
		this.setTitle("Flow Layout");
		c=this.getContentPane();
		fLayout=new FlowLayout(); // Dydefault  Align is Center

		/**
		make Gap :
		fLayout =new FlowLayout(FlowLayout.LEFT, 10,50);
					here LEFT is Alignment & 10 is Horizontal Gap & 5 is Vertical Gap

		Or:-

		fLayout=new FlowLayout(FlowLayout.LEFT);
		fLayout.setHgap(10);
		fLayout.setVgap(5);

		*/

		c.setLayout(fLayout);

		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		btn5=new JButton("5");

		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);

		// make GAP
		fLayout.setHgap(10);
		fLayout.setVgap(5);


	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}