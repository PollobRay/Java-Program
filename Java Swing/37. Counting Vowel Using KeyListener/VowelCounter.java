import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Container;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class VowelCounter extends JFrame
{
	private Container c;
	private JLabel promptLabel, vowelLabel, aLabel, eLabel, iLabel, oLabel, uLabel;
	private JTextArea inputTextArea;
	private JScrollPane scroll;
	private int totalVowel=0;
	private int lettera=0, lettere=0, letteri=0, lettero=0, letteru=0;
	private Font f;
	VowelCounter()
	{
		initCompoments();
	}

	public void initCompoments()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,600,500);
		this.setTitle("Vowel Counter");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.RED);

		f=new Font("Arial",Font.BOLD,18);

		promptLabel=new JLabel("Enter Text");
		promptLabel.setBounds(10,20,100,30);
		promptLabel.setFont(f);
		c.add(promptLabel);

		inputTextArea=new JTextArea();
		inputTextArea.setLineWrap(true);
		inputTextArea.setWrapStyleWord(true);
		inputTextArea.setFont(f);
		scroll=new JScrollPane(inputTextArea);
		scroll.setBounds(110,20,450,100);
		c.add(scroll);

		vowelLabel=new JLabel();
		vowelLabel.setBounds(110,150,250,30);
		vowelLabel.setFont(f);
		c.add(vowelLabel);

		aLabel=new JLabel();
		aLabel.setBounds(110,190,150,30);
		aLabel.setFont(f);
		c.add(aLabel);

		eLabel=new JLabel();
		eLabel.setBounds(110,230,150,30);
		eLabel.setFont(f);
		c.add(eLabel);

		iLabel=new JLabel();
		iLabel.setBounds(110,270,150,30);
		iLabel.setFont(f);
		c.add(iLabel);

		oLabel=new JLabel();
		oLabel.setBounds(110,310,150,30);
		oLabel.setFont(f);
		c.add(oLabel);

		uLabel=new JLabel();
		uLabel.setBounds(110,350,150,30);
		uLabel.setFont(f);
		c.add(uLabel);

		inputTextArea.addKeyListener(new KeyListener()
			{

				public void keyTyped(KeyEvent ke)
				{

				}

				public void keyReleased(KeyEvent ke)
				{

				}

				public void keyPressed(KeyEvent ke)
				{
					if(ke.getSource()==inputTextArea)
					{
						if(ke.VK_A==ke.getKeyCode()) // VK_A =a
						{
							lettera++;
							totalVowel++;
						}
						if(ke.VK_E==ke.getKeyCode()) // VK_E =e
						{
							lettere++;
							totalVowel++;
						}
						if(ke.VK_I==ke.getKeyCode()) // VK_I =i
						{
							letteri++;
							totalVowel++;
						}
						if(ke.VK_O==ke.getKeyCode()) // VK_O =o
						{
							lettero++;
							totalVowel++;
						}
						if(ke.VK_U==ke.getKeyCode()) // VK_U =u
						{
							letteru++;
							totalVowel++;
						}
					}

				vowelLabel.setText("Total Vowel :"+totalVowel);
				aLabel.setText("Total a :"+lettera);
				eLabel.setText("Total e :"+lettere);
				iLabel.setText("Total i :"+letteri);
				oLabel.setText("Total o :"+lettero);
				uLabel.setText("Total u :"+letteru);
				}

				
			});
	}

	public static void main(String[] args) {
		
		VowelCounter v=new VowelCounter();
		v.setVisible(true);
	}
}