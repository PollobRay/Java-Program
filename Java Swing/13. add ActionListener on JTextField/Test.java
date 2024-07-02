import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

class Test extends JFrame
{
    private Container c;
    private JTextField t1;

    Test()
    {
        initc();
    }

    public void initc()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        t1=new JTextField();
        t1.setBounds(50,50,150,50);
        c.add(t1);
        t1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s=t1.getText();
                if(s.isEmpty())
                {}
                else
                    JOptionPane.showMessageDialog(null,"You enter "+s);
            }
        });

    }
    public static void main(String[] args) {
        Test t=new Test();
        t.setSize(500,500);
        t.setVisible(true);
    }
	
}