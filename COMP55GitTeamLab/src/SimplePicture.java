//comment one
//comment two
//comment three
import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		
		add(robot);

		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);

		label.setColor(Color.green);
		

		//GLabel label = new GLabel("I'm blue da ba dee da ba die", 200, 400);
		//GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
		label.setColor(Color.blue);

		add(label);
		
		GOval circle= new GOval(40,400);
		add(circle);
	}
}