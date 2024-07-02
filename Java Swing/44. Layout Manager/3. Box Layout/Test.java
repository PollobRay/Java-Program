import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import javax.swing.BoxLayout;

class Test extends JFrame
{

	private Container c;
	private JButton btn1,btn2,btn3,btn4,btn5;
	private BoxLayout box; 

	Test()
	{
		this .setSize(500,500);
		this.setTitle("Box Layout");
		c=this.getContentPane();

		// BoxLayout(Container c, int axis)
		box=new BoxLayout(c, BoxLayout.Y_AXIS); // It arrange components Horizontally or Vertically
			// Y_AXIS : Vertiacl
			// X_AXIS : Horizontal

		c.setLayout(box);

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
		
	//	c.add(BoxLayout.createVerticalStrut(10)); // here Problem


	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}