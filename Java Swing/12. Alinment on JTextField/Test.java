import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Container;

class Test
{
	public static void main(String[] args) {
		
		 JFrame f= new JFrame("TextField Example");  
    JTextField t1,t2;  
    t1=new JTextField();  
    t1.setBounds(50,100, 200,30);  
    t1.setBackground(Color.GREEN);
    t1.setForeground(Color.PINK);
    t1.setHorizontalAlignment(JTextField.CENTER);
    // t1.setHorizontalAlignment(JTextField.RIGHT);
    t2=new JTextField("AWT Tutorial");  
    t2.setBounds(50,150, 200,30);  
    f.add(t1); f.add(t2);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);

	}
}