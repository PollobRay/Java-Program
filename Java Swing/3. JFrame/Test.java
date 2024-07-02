import javax.swing.JFrame;

class Test
{
	public static void main(String[] args) {
		
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		// frame.setSize(400,300);
		// frame.setLocationRelativeTo(null); // center
		// frame.setLocation(200,50);
		frame.setBounds(400,300,500,200);

		frame.setTitle("Title");
		frame.setResizable(true);
	}
}