import javax.swing.*;
import java.awt.*;

class Test extends JFrame
{
	JTextArea ta;
	Container c;

	public Test()
	{
		c=this.getContentPane();

		this.setSize(500,500);
		ta=new JTextArea();
		//ta.setBounds(50,50,300,200);
		ta.setLineWrap(true); //for line Wrap

		JScrollPane scroll=new JScrollPane(ta);

		// JScrollPane scroll=new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED)

		scroll.setBounds(50,50,300,200);
		this.add(scroll);

		ta.setWrapStyleWord(true); //for word
		c.add(ta);
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}