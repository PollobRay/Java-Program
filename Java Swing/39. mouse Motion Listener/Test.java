import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

class Test extends JFrame
{
	private Container c;
	private JTextArea ta;
	private JTextField tf;

	Test()
	{
		initC();
	}

	public void initC()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,400);
		this.setTitle("Mouse Motion Listener");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		ta=new JTextArea();
		ta.setBounds(10,20,200,200);
		c.add(ta);

		tf=new JTextField();
		tf.setBounds(220,20,150,50);
		c.add(tf);


		ta.addMouseMotionListener(new MouseMotionListener()
		{
			public void mouseDragged(MouseEvent me)
			{
				tf.setText("Mouse Dragged "+"X:"+me.getX()+" Y:"+me.getY());
			}
			public void mouseMoved(MouseEvent me)
			{
				tf.setText("mouse Moved");
			}
		});
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}