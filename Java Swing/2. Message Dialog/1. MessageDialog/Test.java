import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Test
{
	public static void main(String args[])
	{
		//JOptionPane.showMessageDialog(null,"wrong password");
		//JOptionPane.showMessageDialog(null,"Wrong password",1);

		ImageIcon img=new ImageIcon("myimg.png");
		JOptionPane.showMessageDialog(null,"Wrong password","This is Title",-1,img);
	}
}