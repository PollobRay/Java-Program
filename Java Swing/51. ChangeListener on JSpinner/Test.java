import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;
import java.awt.Container;

class Test extends JFrame
{
	private JLabel label;
	private JSpinner spiner;
	private SpinnerNumberModel n;
	private Container c;

	Test()
	{
		init();
	}
	public void init()
	{
		this.setSize(500,500);
		
		label=new JLabel();
		c=this.getContentPane();
		c.setLayout(null);
		n=new SpinnerNumberModel(10,1,50,1);
		label.setBounds(50,300,100,50);
		spiner=new JSpinner(n);
		spiner.setBounds(50,50,100,50);
		c.add(label);
		c.add(spiner);

		class Handler implements ChangeListener
		{
			public void stateChanged(ChangeEvent e)
			{
				String number =spiner.getValue().toString();
				label.setText(number);
			}
		}
		Handler h=new Handler();
		spiner.addChangeListener(h);

	}
	public static void main(String[] args) {
		Test t=new Test();
		t.setVisible(true);
	}
}