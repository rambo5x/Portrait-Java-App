/*Makes a Circle within a Triangle*/

import java.applet.Applet;
import java.awt.*;

public class TriangleC extends Applet {

	private final int WIDTH = 600;
	private final int HEIGHT = 600;
	private int[] xPosT = {300,350,400};
	private int[] yPosT = {300,200,300};
	
	public void init() {
		setBackground(Color.black);
		setSize(WIDTH, HEIGHT);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillPolygon(xPosT, yPosT, xPosT.length);
		g.setColor(Color.red);
		g.fillOval(335,245,30,30);
	}
	
}
