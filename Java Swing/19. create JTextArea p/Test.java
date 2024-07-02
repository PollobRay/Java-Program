import javax.swing.*;
import java.awt.*;
class Test
{
	public static void main(String[] args) {
		
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);

		JTextArea ta=new JTextArea();
		ta.setBounds(50,50,20,20);
		ta.setBackground(Color.PINK);

		f.add(ta);
		f.setVisible(true);
	}
}