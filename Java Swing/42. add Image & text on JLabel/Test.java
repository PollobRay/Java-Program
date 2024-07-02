import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class Test extends JFrame
{
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setSize(500,500);
		t.setVisible(true);
		t.setLayout(null);

		ImageIcon img=new ImageIcon("my.png");
		JLabel label=new JLabel("This is an image",img,JLabel.LEFT);
		label.setBounds(50,50,200,50);
		t.add(label);
	}
}