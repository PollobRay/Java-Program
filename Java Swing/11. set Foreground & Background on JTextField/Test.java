import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;

class Test
{
	public static void main(String[] args) {
		
		JFrame f=new JFrame("Title");
		f.setSize(500,500);
		f.setVisible(true);
		Container c=f.getContentPane();
		JTextField t=new JTextField();
		t.setBounds(50,50,200,50);
		t.setForeground(Color.PINK);
		t.setBackground(Color.GREEN);
		t.setVisible(true);
		c.add(t);

	}
}