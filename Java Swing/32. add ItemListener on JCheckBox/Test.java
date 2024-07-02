import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

class Test extends JFrame
{
	private Container c;
	private JCheckBox male, female;
	private ButtonGroup grp;
	private JLabel label;

	Test()
	{
		this.setSize(500,500);
		this.setVisible(true);
		male=new JCheckBox("Male");
		female=new JCheckBox("female");
		male.setBounds(50,50,200,50);
		female.setBounds(50,100,200,50);
		this.add(male);
		this.add(female);
		grp=new ButtonGroup();
		grp.add(male);
		grp.add(female);
		label=new JLabel();
		label.setBounds(200,300,200,50);
		this.add(label);

		class Handler implements ItemListener
		{
			public void itemStateChanged(ItemEvent e)
			{
				if(male.isSelected())
				{
					label.setText("You selected Male");
				}
				else if(female.isSelected())
				{
					label.setText("You selected Female");
				}
			}
		}

		Handler h=new Handler();

		male.addItemListener(h);
		female.addItemListener(h);

	}
	public static void main(String[] args) {
		
		Test t=new Test();
		
	}
}