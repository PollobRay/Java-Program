import java.awt.Container;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;

class Test
{
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setSize(500,500);
		Container c=f.getContentPane();
		JLabel l=new JLabel();
		l.setText("Enter Your Name: ");
		l.setBounds(10,50,200,20);
		c.add(l);
	}
}