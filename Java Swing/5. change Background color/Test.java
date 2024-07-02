import java.awt.*;
import javax.swing.*;

class Test
{
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setBounds(100,50,500,500);
		f.setVisible(true);
		Container c=f.getContentPane();
		c.setBackground(Color.MAGENTA);
	}
}