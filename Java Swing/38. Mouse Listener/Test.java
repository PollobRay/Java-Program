import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class Test extends JFrame
{
	private Container c;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane scroll;

	Test()
	{
		inintComponent();
	}

	public void inintComponent()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Mouse Listener");

		c=this.getContentPane();
		c.setLayout(null);

		tf=new JTextField();
		tf.setBounds(20,20,150,50);
		c.add(tf);

		ta=new JTextArea();
		ta.setBackground(Color.PINK);
		scroll=new JScrollPane(ta);
		scroll.setBounds(10,80,300,300);
		c.add(scroll);




		tf.addMouseListener(new MouseListener()
			{
				public void mouseClicked(MouseEvent me)
				{
					ta.append("mouse Clicked \n");
				}

				public void mousePressed(MouseEvent me)
				{
					ta.append("mouse Presed \n");
				}

				public void mouseReleased(MouseEvent me)
				{
					ta.append("mouse Relased \n");
				}

				public void mouseExited(MouseEvent me)
				{
					ta.append("mouse Exited \n");
				}
				public void mouseEntered(MouseEvent me)
				{
					ta.append("mouse Entered \n");
				}

			});
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}