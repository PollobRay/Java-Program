import javax.swing.JFrame;
import javax.swing.JComboBox;

class Test extends JFrame
{
	private JComboBox cb;
	private String[] prolan={"C","CPP","JAVA","PHP"};
	Test()
	{

		this.setSize(500,500);
		this.setVisible(true);
		this.setLayout(null);
	cb=new JComboBox(prolan);
	cb.setBounds(50,150,100,50);
	this.add(cb);

	cb.setSelectedItem("JAVA");
	System.out.println("Totala item :"+cb.getItemCount());

	cb.addItem("PYTHON");
	cb.addItem("KOTLIN");
	cb.addItem("C#");

	cb.removeItem("C#");
	cb.removeItemAt(1); //remove CPP

	}
	public static void main(String[] args) {
		
		Test t=new Test();
	}
}