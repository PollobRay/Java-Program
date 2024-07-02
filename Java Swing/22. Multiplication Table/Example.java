import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.Font;
public class Example extends JFrame
{
	private Container c;
	private JLabel imgLabel, textLabel;
	private JTextField tf;
	private JTextArea ta;
	private JButton clearButton;
	private ImageIcon img;
	private Font f;
	private Cursor cursor; 

	public Example()
	{
		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);
		img=new ImageIcon("img.png");

		imgLabel=new JLabel(img);

		imgLabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());

		c.add(imgLabel);
		textLabel=new JLabel("Enter any Number :");
		textLabel.setBounds(20,200,250,50);
		c.add(textLabel);
		textLabel.setForeground(Color.MAGENTA);
		f=new Font("Tahoma",Font.BOLD ,20);
		textLabel.setFont(f);
		c.add(textLabel);

		tf=new JTextField();
		tf.setBounds(230,200,90,50);
		tf.setBackground(Color.GREEN);
		tf.setHorizontalAlignment(JTextField.CENTER);
		tf.setFont(f);
		c.add(tf);

		clearButton=new JButton("Clear");
		clearButton.setBounds(230,260,90,50);
		clearButton.setBackground(Color.GREEN);
		c.add(clearButton);
		clearButton.setFont(f);

		cursor=new Cursor(Cursor.HAND_CURSOR);
		clearButton.setCursor(cursor);

		ta=new JTextArea();
		ta.setBounds(20,350,300,300);
		ta.setBackground(Color.GREEN);
		ta.setFont(f);
		c.add(ta);

		tf.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					ta.setText("");

					String v=tf.getText();
					//tf.setText(" ");
					if(v.isEmpty())
					{

					}
					else
					{
						int num=Integer.parseInt(tf.getText());
						for(int i=1; i<=10; i++)
						{
							int result=num*i;
							String r=String.valueOf(result);
							String n=String.valueOf(num);
							String inc=String.valueOf(i);
							ta.append(n+" * "+inc+" = "+r+"\n");
						}
					}
				}
			});

		clearButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					ta.setText("");
					tf.setText("");
				}
			});


	}

	public static void main(String ar[])
	{
		Example e=new Example();
		e.setVisible(true);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setBounds(100,50,400,700);
		e.setTitle("Multiplication Table");
	}
}