mport javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Example
{
	private JTextField tf;
	private JRadioButton male, female;
	priavte ButtonGroup grp;
	Example()
	{
		 f=new JFrame("Example");
	f.setSize(500,500);
	f.setVisible(true);

	 grp=new ButtonGroup();
 male=new JRadioButton("Male");
	 female=new JRadioButton("Female");
	male.setBounds(50,50,100,20);
	female.setBounds(50,100,100,20);

	//f.add(male);
	//f.add(female);
	grp.add(male);
	grp.add(female);
	//f.add(grp);
	f.add(male);
	f.add(female);
	tf=new JTextField();
	tf.setBounds(50,200,200,30);
	tf.add(tf);
	f.add(tf);
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==male)
				tf.setText("Male");

			else
				tf.setText("Famle");
		}
	}
	Handler h=new Handler();
	male.addActionListener(h);
	female.addActionListener(h);
	}
	public static void main(String[] args) {
	
		Example x=new Example();


}}