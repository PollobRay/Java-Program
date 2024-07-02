import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Example extends JFrame
{
	private JTextArea ta;
	private JTextField tf;

	Example()
	{
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		ta=new JTextArea();
		tf=new JTextField();

		tf.setBounds(50,50,100,20);
		this.add(tf);

		ta.setBounds(50,100,200,400);
		this.add(ta);

		
		tf.addKeyListener(new KeyListener()
			{
				public void keyTyped(KeyEvent ke)
				{
					ta.append("Key Tayped :"+ke.getKeyChar()+"\n");
				}

				public void keyPressed(KeyEvent ke)
				{
					ta.append("Key Pressed :"+ke.getKeyChar()+"\n");
				}

				public void keyReleased(KeyEvent ke)
				{
					ta.append("Key Released :"+ke.getKeyChar()+"\n");
				}
			});


	}
	public static void main(String[] args) {
		
		Example e=new Example();
	}
}