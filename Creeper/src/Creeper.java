/*
 *Creates a creeper head graphic design.
 *
 *@author(Michael Morales & Jesus Jose Meza)
 *@version(1.0)
 */


import java.awt.*;
import javax.swing.JFrame;

public class Creeper extends JFrame implements Runnable {
	
	public Creeper() {
		super("Creeper Head ");
		setSize(800, 1024);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		/*BACKGROUND COLOR*/
		
		g.drawRect(0, 0, 800, 1024);
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 1024);
		
		/*LINES AND MOON*/
		
		g.setColor(Color.red);
		g.drawLine(432, 496, 560, 576);
		
		g.setColor(Color.red);
		g.drawLine(464, 464, 564, 576);
		
		g.drawOval(480, 464, 64, 64);
		g.setColor(Color.white);
		g.fillOval(480, 474, 64, 64);
		
		/*OUTLINE OF HEAD AND EYES*/
		
		g.drawRect(399,511,128,128);
		g.setColor(Color.green);
		g.fillRect(400, 512, 128, 128);
		g.drawRect(432, 544, 16, 16);
		g.setColor(Color.black);
		g.fillRect(432, 544, 16, 16);
		g.drawRect(480,544,16,16);
		g.setColor(Color.black);
		g.fillRect(480, 544, 16, 16);
		
		/*MOUTH*/
		
		
		g.drawRect(448,576,16,16);
		g.setColor(Color.black);
		g.fillRect(448, 576, 16, 16);
		
		g.drawRect(464,576,16,16);
		g.setColor(Color.black);	
		g.fillRect(464, 576, 16, 16);
		
		g.drawRect(448,592,16,16);
		g.setColor(Color.black);
		g.fillRect(448, 592, 16, 16);
		
		g.drawRect(464,592,16,16);
		g.setColor(Color.black);
		g.fillRect(464,592,16,16);
		
		g.drawRect(480,592,16,16);
		g.setColor(Color.black);
		g.fillRect(480,592,16,16);
		
		g.drawRect(432,592,16,16);
		g.setColor(Color.black);
		g.fillRect(432,592,16,16);
		
		/*FORMATION OF FACE*/
		
	/*	g.drawRect(400, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(401, 513, 15,15);
		
		g.drawRect(417, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(418, 513, 15,15);
	*/	
		/*FIRST ROW*/
	/*	g.drawRect(400, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 512, 16,17);
		
		g.drawRect(416, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 512, 16,16);
		
		g.drawRect(432, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 512, 16,16);
		
		g.drawRect(448, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 512, 16,16);
		
		g.drawRect(464, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 512, 16,16);
		
		g.drawRect(480, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 512, 16,16);
		
		g.drawRect(496, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 512, 16,16);
		
		g.drawRect(510, 512, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 512, 16,16);*/
		
		/*SECOND ROW*/
		/*g.drawRect(400, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 528, 16,17);
		
		g.drawRect(416, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 528, 16,16);
		
		g.drawRect(432, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 528, 16,16);
		
		g.drawRect(448, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 528, 16,16);
		
		g.drawRect(464, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 528, 16,16);
		
		g.drawRect(480, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 528, 16,16);
		
		g.drawRect(496, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 528, 16,16);
		
		g.drawRect(510, 528, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 528, 16,16);*/
		
		/*THIRD ROW*/
		/*g.drawRect(400, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 544, 16,17);
		
		g.drawRect(416, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 544, 16,16);
		
		g.drawRect(448, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 544, 16,16);
		
		g.drawRect(464, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 544, 16,16);
	
		g.drawRect(496, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 544, 16,16);
		
		g.drawRect(510, 544, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 544, 16,16);*/
		
		/*FOURTH ROW*/
	/*	g.drawRect(400, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 560, 16,17);
		
		g.drawRect(416, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 560, 16,16);
		
		g.drawRect(432, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 560, 16,16);
		
		g.drawRect(448, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 560, 16,16);
		
		g.drawRect(464, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 560, 16,16);
		
		g.drawRect(480, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 560, 16,16);
		
		g.drawRect(496, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 560, 16,16);
		
		g.drawRect(510, 560, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 560, 16,16);*/
		
		/*FIFTH ROW*/
	/*	g.drawRect(400, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 576, 16,17);
		
		g.drawRect(416, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 576, 16,16);
		
		g.drawRect(432, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 576, 16,16);
		
		g.drawRect(480, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 576 ,16,16);
		
		g.drawRect(496, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 576, 16,16);
		
		g.drawRect(510, 576, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 576, 16,16);*/
		
		/*SIXTH ROW*/
		/*g.drawRect(400, 592, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 592, 16,17);
		
		g.drawRect(416, 592, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 592, 16,16);
		
		g.drawRect(496, 592, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 592, 16,16);
		
		g.drawRect(510, 592, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 592, 16,16);*/
		
		/*SEVENTH ROW*/
	/*	g.drawRect(400, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 608, 16,17);
		
		g.drawRect(416, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 608, 16,16);
		
		g.drawRect(432, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 608, 16,16);
		
		g.drawRect(448, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 608, 16,16);
		
		g.drawRect(464, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 608, 16,16);

		g.drawRect(480, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 608, 16,16);
		
		g.drawRect(496, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 608, 16,16);
		
		g.drawRect(510, 608, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 608, 16,16);*/
		
		/*EIGHTH ROW*/
/*		g.drawRect(400, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(400, 624, 16,15);
		
		g.drawRect(416, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(416, 624, 16,15);
		
		g.drawRect(432, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(432, 624, 16,15);
		
		g.drawRect(448, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(448, 624, 16,15);
		
		g.drawRect(464, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(464, 624, 16,15);
		
		g.drawRect(480, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(480, 624, 16,15);
		
		g.drawRect(496, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(496, 624, 16,15);
		
		g.drawRect(510, 624, 16,16);
		g.setColor(Color.green);
		g.fillRect(510, 624, 16,15);*/
	}
 
	public static void main(String[] args) {
		Creeper application = new Creeper();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
