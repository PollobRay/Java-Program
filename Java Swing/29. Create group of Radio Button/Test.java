import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.Container;
import javax.swing.ButtonGroup;

class Test extends JFrame
{
	private Container c;
	private JCheckBox male, female;
	private ButtonGroup grp;

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

	}
	public static void main(String[] args) {
		
		Test t=new Test();
		//t.setSize(500,500);
		//t.setVisible(true);
	}
}