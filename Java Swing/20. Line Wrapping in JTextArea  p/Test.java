import javax.swing.*;
import java.awt.*;

class Test extends JFrame
{
	JTextArea ta;
	public Test()
	{
		this.setSize(500,500);
		ta=new JTextArea();
		ta.setBounds(50,50,300,200);
		ta.setLineWrap(true); //for line Wrap

		ta.setWrapStyleWord(true); //for word
		this.add(ta);
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}