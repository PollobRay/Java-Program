import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
class Test
{
	public static void main(String[] args) {
		
		JFrame frame=new JFrame();
		frame.setSize(500,500);
		frame.setLayout(null);

		JButton btn=new JButton("Save As");
		btn.setBounds(200,300,100,50);
		frame.add(btn);

		JLabel lb=new JLabel();
		lb.setBounds(100,150,300,50);
		frame.add(lb);

		btn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JFileChooser chooser=new JFileChooser();
					chooser.showOpenDialog(null);
					File f=chooser.getCurrentDirectory();
					String path=f.getAbsolutePath();
					lb.setText(path);
				}
			});

		frame.setVisible(true);
	}
}