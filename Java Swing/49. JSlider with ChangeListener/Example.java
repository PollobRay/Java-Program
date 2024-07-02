import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

class Example extends JFrame
{
	
	Container c;
	JLabel redLabel, greenLabel, blueLabel, preview;
	JSlider redSlider, greenSlider, blueSlider;
	JPanel panel;
	JTextField redTf, greenTf, blueTf;

	Example()
	{
		initComponent();
	}

	public void initComponent()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,800,500);
		this.setTitle("Slider");
		this.setLayout(null);
		c=this.getContentPane();
		c.setBackground(Color.PINK);

		redLabel=new JLabel("Red");
		redLabel.setBounds(50,50,80,50);
		c.add(redLabel);

		redSlider=new JSlider(0,255,0);
		redSlider.setBounds(90,50,300,50);
		c.add(redSlider);

		redTf=new JTextField();
		redTf.setBounds(400,50,80,40);
		redTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(redTf);


		greenLabel=new JLabel("Green");
		greenLabel.setBounds(50,110,80,50);
		c.add(greenLabel);

		greenSlider=new JSlider(0,255,0);
		greenSlider.setBounds(90,110,300,50);
		c.add(greenSlider);

		greenTf=new JTextField();
		greenTf.setBounds(400,110,80,40);
		greenTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(greenTf);


		blueLabel=new JLabel("Blue");
		blueLabel.setBounds(50,170,80,50);
		c.add(blueLabel);

		blueSlider=new JSlider(0,255,0);
		blueSlider.setBounds(90,170,300,50);
		c.add(blueSlider);

		blueTf=new JTextField();
		blueTf.setBounds(400,170,80,40);
		blueTf.setHorizontalAlignment(JTextField.CENTER);
		c.add(blueTf);


		panel=new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(550,50,200,160);
		add(panel);

		preview=new JLabel("PreView");
		preview.setBounds(630,200,100,50);
		c.add(preview);


		class Handler implements ChangeListener
		{

			public void stateChanged(ChangeEvent e)
			{
				int r=redSlider.getValue();
				int g=greenSlider.getValue();
				int b=blueSlider.getValue();

				redTf.setText(""+r);
				greenTf.setText(""+g);
				blueTf.setText(""+b);


				Color color=new Color(r,g,b);
				panel.setBackground(color);

			}
		}

		Handler h=new Handler();

		redSlider.addChangeListener(h);
		greenSlider.addChangeListener(h);
		blueSlider.addChangeListener(h);



	}

	public static void main(String[] args) {
		
		Example t=new Example();
		
		t.setVisible(true);
	}
}