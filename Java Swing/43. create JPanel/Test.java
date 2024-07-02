import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;

class Test extends JFrame
{
	private Container c;
	private JPanel panel1, panel2;
	private JButton btn1,btn2;

	Test()
	{
		this.setSize(600,500);
		c=this.getContentPane();

		c.setLayout(null);
		panel1=new JPanel();
		panel1.setBounds(10,100,200,200);
		panel1.setBackground(Color.RED);
		c.add(panel1);

		panel2=new JPanel();
		panel2.setBounds(355,100,200,300);
		panel2.setBackground(Color.GREEN);
		c.add(panel2);

		btn1=new JButton("1");
		btn2=new JButton("2");

		panel1.add(btn1);
		panel2.add(btn2);
	} 
	public static void main(String[] args) {
		Test t=new Test();
		t.setVisible(true);
	}
}