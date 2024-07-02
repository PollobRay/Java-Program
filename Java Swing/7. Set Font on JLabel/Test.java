import java.awt.Font;
import javax.swing.*;
import java.awt.Container;
import java.awt.Color;
class Test extends JFrame
{
	private Container c;
	private JLabel username, password;
	private Font f;

	public Test()
	{
		initc();
	}
	public void initc()
	{

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);
		f=new Font("Arial",Font.BOLD,14);
		username=new JLabel("Name : ");
		username.setBounds(50,20,200,50);
		username.setFont(f);
		c.add(username);
		password=new JLabel("Password :");
		password.setBounds(50,70,200,50);
		password.setFont(f);
		c.add(password);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.setVisible(true);
		t.setSize(400,400);
		
	}
}