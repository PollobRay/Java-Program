import java.applet.*;
import java.awt.*;
//<applet code="Test" height=400 width=400></applet>
public class Test extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Pollob",100,100);
		showStatus("Status message");
	}
}