import javax.swing.JFrame;
import javax.swing.ImageIcon;

class Test extends JFrame 
{
	private ImageIcon icon;
	
	public Test()
	{
		init();
	}
	
	public void init()
	{
		this.setSize(500,500);
		icon=new ImageIcon(getClass().getResource("myimg.png"));
		this.setIconImage(icon.getImage());
	}
	public static void main(String ar[])
	{
		Test t=new Test();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
		
		