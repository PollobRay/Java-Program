import javax.swing.JOptionPane;

class Test
{
	public static void main(String ar[])
	{
		String r=JOptionPane.showInputDialog("Enter your name: ");
		String a=JOptionPane.showInputDialog("Enter your conferm Name: ","Pollob"); // here Pollob is Placeholder
		String b=JOptionPane.showInputDialog(null,"Enter Name","title",JOptionPane.QUESTION_MESSAGE);
	}
}