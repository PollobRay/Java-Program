import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test extends JFrame
{
	Container c;
	JButton bt;

	Test()
	{
		init();
	}

	public void init()
	{
		this.setBounds(20,100,500,400);
		this.setTitle("Color chosser");
		c=this.getContentPane();
		c.setLayout(null);

		bt=new JButton("Color Chooser");
		bt.setBounds(100,50,150,50);
		c.add(bt);
		bt.addActionListener(new ActionListener()
			{

				public void actionPerformed(ActionEvent e)
				{
					Color color=JColorChooser.showDialog(null,"Select Color",Color.YELLOW); // bydefault color Yellow
					c.setBackground(color);
				}


			});
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}