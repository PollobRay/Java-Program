import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Color;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

class Window extends JFrame
{
	Container c;

	Window()
	{
		initc();
	}

	public void initc()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,100,500,500);
		this.setTitle("Window Event");

		c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		this.addWindowListener(new WindowListener(){
				public void windowOpened(WindowEvent we)
				{
					System.out.println("Window Opened");
				}
				public void windowClosed(WindowEvent we)
				{
					System.out.println("Window Closed");
				}
				public void  windowIconified(WindowEvent we)
				{
					System.out.println("Window Iconfield");
				}
				public void windowDeiconified(WindowEvent we)
				{
					System.out.println("window Deiconifield");
				}

				public void windowClosing(WindowEvent we)
				{
					System.out.println("window Closing");
				}
				public void windowActivated(WindowEvent we)
				{
					System.out.println("window Actived");
				}
				public void windowDeactivated(WindowEvent we)
				{
					System.out.println("window Deactived");
				}});

			
	}

	public static void main(String[] args) {
		
		Window w=new Window();
		w.setVisible(true);
	}
}