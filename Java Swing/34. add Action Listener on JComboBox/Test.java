import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Test extends JFrame
{
	private JComboBox cb;
	private String[] prolan={"C","CPP","JAVA","PHP"};
	private JLabel label;
	Test()
	{

		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
	cb=new JComboBox(prolan);
	cb.setBounds(50,150,100,50);
	this.add(cb);

	label=new JLabel();
	label.setBounds(160,150,200,50);
	this.add(label);

	cb.setSelectedItem("JAVA");
	
	cb.addItem("PYTHON");
	cb.addItem("KOTLIN");
	cb.addItem("C#");

	cb.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String s=cb.getSelectedItem().toString();
			label.setText("You have Selected : "+s);
		}
	});

	}
	public static void main(String[] args) {
		
		Test t=new Test();
	}
}