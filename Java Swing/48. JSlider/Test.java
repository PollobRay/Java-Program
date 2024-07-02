import javax.swing.JFrame;
import javax.swing.JSlider;

class Test extends JFrame
{
	JSlider slider;

	Test()
	{
		this.setLayout(null);
		slider=new JSlider(0,20,0); // 0 to 20 increse 0
		// slider=new JSlider(JSlider.VERTICAL,0,20,0); // for vertically

		slider.setBounds(100,50,300,50);

		slider.setMinorTickSpacing(1); // after 1
		slider.setMajorTickSpacing(5); //after 5
		
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		this.add(slider);
	}

	public static void main(String[] args) {
		
		Test t=new Test();
		t.setSize(500,500);
		t.setVisible(true);
	}
}