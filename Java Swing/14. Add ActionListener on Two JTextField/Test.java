import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

class Test
{
	JFrame f;
	JTextField j1,j2;
	JLabel l1;

	public Test()
	{
		f=new JFrame();
		f.setSize(500,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 j1=new JTextField();
		 j2=new JTextField();
		j1.setBounds(50,50,200,50);
		f.add(j1);
		j2.setBounds(50,120,200,50);
		f.add(j2);

		l1=new JLabel();
		l1.setBounds(100,300,200,50);
		f.add(l1);

		class Handler implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==j1)	
				{
					l1.setText("Text 1");
				}
				else if(e.getSource()==j2)
				{
					l1.setText("Text 2");
				}
			}
		}

		Handler h=new Handler();
		j1.addActionListener(h);
		j2.addActionListener(h);

		
	}
	public static void main(String[] args) {
		
		Test t=new Test();


	}
}