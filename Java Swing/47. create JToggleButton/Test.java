import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Color;
class Test
{
	Container c;
	JToggleButton tb;
	JLabel label;
	ImageIcon onIcon, offIcon;

	Test()
	{
		intic();
	}

	public void intic()
	{
		JFrame frame=new JFrame("Toggle Button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100,100,400,300);
		frame.setVisible(true);

		c=frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		onIcon=new ImageIcon("on.png");
		offIcon=new ImageIcon("off.png");

		tb=new JToggleButton(offIcon);
		tb.setBounds(50,50,90,90);
		c.add(tb);

		label=new JLabel("Hello there");
		label.setVisible(false);
		label.setBounds(50,150,150,50);
		c.add(label);

		tb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(tb.isSelected())
					{
						label.setVisible(true);
						tb.setIcon(offIcon);
					}
					else
					{
						label.setVisible(false);
						tb.setIcon(onIcon);
					}
				}
			});
	}

	public static void main(String[] args) {
		
		Test t=new Test();
	}
}