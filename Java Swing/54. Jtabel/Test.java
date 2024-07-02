import javax.swing.*;
import java.awt.*;

class Test extends JFrame
{
	Container c;
	JTable tabel;
	JLabel label;
	JScrollPane scroll;
	String cols[]={"Id","Pollob","GPA"};
	String rows[][]={
			{"46","Pollob","3.84"},
			{"77","Nippon","3.88"},
			{"87","Shown","3.89"}
	};

	Test()
	{
		init();
	}

	public void init()
	{
		this.setBounds(100,100,750,450);
		c=this.getContentPane();
		c.setLayout(null);
		label=new JLabel("Student Details");
		label.setBounds(250,20,200,50);
		c.add(label);

		tabel=new JTable(rows,cols);

		scroll=new JScrollPane(tabel);
		scroll.setBounds(50,80,600,150);
		c.add(scroll);

		//tabel.setEnabled(false); // make it not editabel
		tabel.setSelectionBackground(Color.PINK);

	}
	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}