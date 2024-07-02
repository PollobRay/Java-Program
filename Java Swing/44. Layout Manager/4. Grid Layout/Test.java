import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.GridLayout;

class Test extends JFrame
{

	private Container c;
	private JButton btn1,btn2,btn3,btn4;
	private GridLayout gl; 
	
	Test()
	{
		this .setSize(500,500);
		this.setTitle("Grid Layout");
		c=this.getContentPane();
		//gl=new GridLayout(2,2); // 2,2 is row and colomn
		gl=new GridLayout(2,2,5,5); // 5,5 is H&V gap

		

		c.setLayout(gl);

		btn1=new JButton("1");
		btn2=new JButton("2");
		btn3=new JButton("3");
		btn4=new JButton("4");
		

		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		

		


	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}