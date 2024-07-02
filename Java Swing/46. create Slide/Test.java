import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Test 
{

	private Container c;
	private JButton prevButton,nextButton;
	private CardLayout card;
	private JPanel panel;
	private JLabel label;
	private ImageIcon icon, icon1; 
	private JFrame frame;

	Test()
	{

	initc();	
	showImage();

	}

	public void initc()
	{

		frame=new JFrame();
		frame .setSize(600,500);
		frame.setTitle("Slide");
		c=frame.getContentPane();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c.setLayout(null);

		card =new CardLayout();


		panel=new JPanel(card) ;// card is Layout
		panel.setBounds(10,10,560,380);
		c.add(panel);

		prevButton=new JButton("Previous");
		prevButton.setBounds(10,400,100,50);
		c.add(prevButton);

		nextButton=new JButton("Next");
		nextButton.setBounds(470,400,100,50);
		c.add(nextButton);


		

		
		class Handler implements ActionListener
		{

		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==prevButton)
			{
				card.previous(panel);
			}
			else
			{
				card.next(panel);
			}
		}
		}

		Handler h=new Handler();

		prevButton.addActionListener(h);
		nextButton.addActionListener(h);
		

	}
	public void showImage()
		{
			String[] imageNames={"1.jpg", "2.jpg", "3.jpg"};
			for(String n: imageNames)
			{
				icon=new ImageIcon(""+n);

				Image img=icon.getImage();
				Image newImage=img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
				icon1=new ImageIcon(newImage);
				label=new JLabel(icon1);
				panel.add(label); 
			}
		}

	public static void main(String[] args) {
		
		Test t=new Test();
		

	}
}