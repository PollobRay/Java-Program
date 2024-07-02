import java.awt.Font;
import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
import javax.swing.ImageIcon;

class Test extends JFrame
{
	private Container c;
	private JLabel username, password;
	private Font f;
	private ImageIcon img; 

	public Test()
	{
		initc();
	}
	public void initc()
	{

		img=new ImageIcon(getClass().getResource("image.png"));

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		f=new Font("Arial",Font.BOLD,14);
		username=new JLabel("Name : ");
		username.setBounds(50,20,200,50);
		username.setFont(f);
		username.setForeground(Color.GREEN);

		username.setOpaque(true); // for background
		username.setBackground(Color.YELLOW);

		username.setToolTipText("Help");
		String s=username.getText();
		String s1=username.getToolTipText();

		c.add(username);
		password=new JLabel(img);
		password.setBounds(50,80,img.getIconWidth(),img.getIconHeight());
		password.setFont(f);
		password.setForeground(Color.GREEN);

		password.setOpaque(true); // for background
		password.setBackground(Color.YELLOW);

		c.add(password);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.setVisible(true);
		t.setSize(400,400);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}