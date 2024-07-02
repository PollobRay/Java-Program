import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Color;



class Test implements ActionListener
{
	private JButton red, green;
	private Container c;
	private JFrame frame;

	Test()
	{
		frame=new JFrame();
		frame.setSize(500,500);
		frame.setVisible(true);
		c=frame.getContentPane();
		c.setLayout(null);
		red=new JButton("Red");
		green=new JButton("Green");
		red.setBounds(50,100,100,50);
		green.setBounds(50,170,100,50);
		c.add(red);
		c.add(green);

		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==red)
			{
				c.setBackground(Color.RED);
			}
			else
				c.setBackground(Color.GREEN);
		}

		red.addActionListener(this);
		green.addActionListener(this);

	}

	public static void main(String[] args) {
		
		Test t=new Test();
	}
}