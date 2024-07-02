import java.awt.Cursor;
import javax.swing.*;
import java.awt.*;

class Test
{
	public static void main(String[] args) {
		
		JFrame f=new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setSize(500,500);
		Container c=f.getContentPane();
		c.setLayout(null);
		//c.setBounds(200,200,500,500);

		JButton b=new JButton("Click");
		b.setBounds(50,50,200,50);
		c.add(b);

		Cursor cursor =new Cursor(Cursor.HAND_CURSOR);
		b.setCursor(cursor);

		
	}
}