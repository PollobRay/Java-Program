import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame
{
	JLabel userLabel, passLabel;
	JTextField tf;
	JPasswordField pf;
	Container c;
	JButton submitButton, clearButton;
	Font f;

	public Test()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(10,50,240,350);
		this.setTitle("Login Frame");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);

		userLabel=new JLabel("User Label :");
		userLabel.setBounds(50,50,150,50);
		c.add(userLabel);

		f=new Font("Arial",Font.BOLD,18);
		userLabel.setFont(f);

		tf=new JTextField();
		tf.setBounds(170,50,200,50);
		tf.setFont(f);
		c.add(tf);

		passLabel=new JLabel("Password ");
		passLabel.setBounds(50,120,150,50);
		passLabel.setFont(f);
		c.add(passLabel);

		pf=new JPasswordField();
		pf.setBounds(170,120,200,50);
		c.add(pf);
		pf.setFont(f);
		pf.setEchoChar('*');

		submitButton=new JButton("Login");
		submitButton.setBounds(170,190,90,50);
		submitButton.setFont(f);
		c.add(submitButton);

		clearButton=new JButton("Clear");
		clearButton.setBounds(280,190,90,50);
		clearButton.setFont(f);
		c.add(clearButton);

		clearButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					tf.setText("");
					pf.setText("");
				}
			});

		submitButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String u=tf.getText();
					String p=pf.getText();

					if(u.equals("Pollob")&& p.equals("1234"))
					{
						JOptionPane.showMessageDialog(null,"Welcome");
						NewFrame frame=new NewFrame();
						
						dispose();// for exit the main Frame

						frame.setVisible(true);
					}
					else
						JOptionPane.showMessageDialog(null,"Wrong");
				}
			});
	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}

}