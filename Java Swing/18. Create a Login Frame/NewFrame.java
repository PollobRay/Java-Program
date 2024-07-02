import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NewFrame extends JFrame
{
	Container c;

	public NewFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //for exit just this From
		this.setTitle("New frame");
		this.setBounds(420,50,400,400);

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
	}
	public static void main(String[] args) {
		
		NewFrame f=new NewFrame();
		f.setVisible(true);
	}
}