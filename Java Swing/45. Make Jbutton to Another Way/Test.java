import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.FlowLayout;

class Test extends JFrame
{

	private Container c;
	private JButton btn[];
	private FlowLayout fLayout; // It defualt Laout of JPanel
	
	Test()
	{
		this .setSize(500,500);
		this.setTitle("Flow Layout");
		c=this.getContentPane();
		fLayout=new FlowLayout(); 

		

		c.setLayout(fLayout);

		


		btn=new JButton[9];
		for(int i=0;i<9;i++)
		{
			btn[i]=new JButton(" "+(i+1));
			c.add(btn[i]);
		}



		
		fLayout.setHgap(10);
		fLayout.setVgap(5);


	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);

	}
}