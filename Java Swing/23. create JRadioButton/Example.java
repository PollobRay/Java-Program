import javax.swing.JFrame;
import javax.swing.JRadioButton;
class Example
{public static void main(String[] args) {
	JFrame f=new JFrame("Example");
	f.setSize(500,500);
	f.setVisible(true);

	JRadioButton male=new JRadioButton("Male");
	JRadioButton female=new JRadioButton("Female");
	male.setBounds(50,50,100,20);
	female.setBounds(50,100,100,20);

	f.add(male);
	f.add(female);

}}