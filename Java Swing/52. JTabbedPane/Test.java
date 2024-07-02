import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Container;
class Test extends JFrame
{
	Container c;
	JTabbedPane tp;
	JPanel panel1,panel2, panel3;


	Test()
	{
		init();
	}

	public void init()
	{
		this.setBounds(100,100,450,450);
		this.setTitle("JTabbedPane");
		c=this.getContentPane();
		c.setLayout(null);

		tp=new JTabbedPane();
		tp.setBounds(50,50,300,300);

		panel1=new JPanel();
		panel2=new JPanel();
		panel3=new JPanel();

		tp.addTab("Home",panel1);
		tp.addTab("Help",panel2);
		tp.addTab("Edit",panel3);

		panel1.setBackground(Color.PINK);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.MAGENTA);

		/** add Icon:
		ImageIcon homeicon=new ImageIcon("src/home.png");
		tp.addtab("home",homeicon,panel1);


		add Tool Tips:-
		tp.addTab("Home",homeIcon,panel1,"This is Panel1");

		change placement:-
		tp.setTabPlacement(JTabbedPane.BOTTOM);
		or:-
		tp=new JTabbedPane(JTabbedPane.BOTTOM);

		*/


		c.add(tp);
	}


	public static void main(String[] args) {
		
		Test t=new Test();
		t.setVisible(true);
	}
}