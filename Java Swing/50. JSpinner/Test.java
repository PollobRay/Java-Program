import javax.swing.JSpinner;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

class Test extends JFrame
{
	JSpinner spinner;
	SpinnerNumberModel value;
	Test()
	{
	spinner=new JSpinner();
	//this.setLayout(null);
	spinner.setBounds(100,100,70,50);
	// specific value:
	value=new SpinnerNumberModel(10,0,30,1);// initialization, min, max, Inc/Dec
	spinner=new JSpinner(value);
	this.add(spinner);
}

public static void main(String[] args) {
	
	Test r=new Test();
	r.setBounds(50,50,500,500);
	r.setVisible(true);
}
}