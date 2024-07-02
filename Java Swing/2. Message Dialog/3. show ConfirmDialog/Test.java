import javax.swing.JOptionPane;

class Test
{
	public static void main(String[] args) {
		int choice=JOptionPane.showConfirmDialog(null,"Do you want to ","Quite",JOptionPane.YES_NO_OPTION);

		if(choice==JOptionPane.YES_OPTION)
			System.out.println("You entered yes");

		else
			System.out.println("You enter no");
	}
}