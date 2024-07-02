import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

class Test extends JFrame
{
	private Container c;
	private JButton btn;
	private JTextArea ta;

	Test()
	{
		initc();
	}

	public void initc()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,400);
		this.setTitle("Focus Listener");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);

		btn=new JButton("Button");
		btn.setBounds(10,50,80,50);
		c.add(btn);

		ta=new JTextArea();
		ta.setBounds(100,30,200,200);
		c.add(ta);

		btn.addFocusListener(new FocusListener()
			{
				public void focusGained(FocusEvent fe)
				{
					ta.setText("Focus Gained");
				}

				public void focusLost(FocusEvent fe)
				{
					ta.setText("Focus Lost");
				}
			});
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}