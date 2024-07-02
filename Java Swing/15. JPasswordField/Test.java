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

		JPasswordField pf=new JPasswordField();
		pf.setBounds(50,20,150,50);
		pf.setEchoChar('*');

		c.add(pf);
	}
}