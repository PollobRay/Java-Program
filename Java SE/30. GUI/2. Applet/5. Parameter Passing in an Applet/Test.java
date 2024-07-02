import java.applet.Applet;
import java.awt.*;
/* <applet code="Test" width="300" height="220"><param name="par" value="pollob"></param></applet> */
class Test extends Applet
{
	private String defaultMsg="Hello";
	public void paint(Graphics g)
	{
		String S=getParameter("par");
		if(S==null)
			S=defaultMsg;

		g.drawString(S,50,25);
	}
}