import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
class Example
{public static void main(String[] args) {
	JFrame f=new JFrame("Example");
	f.setSize(500,500);
	f.setVisible(true);

	ButtonGroup grp=new ButtonGroup();
	JRadioButton male=new JRadioButton("Male");
	JRadioButton female=new JRadioButton("Female");
	male.setBounds(50,50,100,20);
	female.setBounds(50,100,100,20);

	//f.add(male);
	//f.add(female);
	grp.add(male);
	grp.add(female);
	//f.add(grp);
	f.add(male);
	f.add(female);

}}