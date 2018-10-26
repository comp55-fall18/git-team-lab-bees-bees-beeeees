//comment one
//comment two
//comment three
import java.awt.Color;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("I like girls", 200, 400);
=======
<<<<<<< HEAD
		GLabel label = new GLabel("I'm blue da ba dee da ba die", 200, 400);
=======
		GLabel label = new GLabel("How I feel when using github hackslash", 200, 400);
>>>>>>> branch 'master' of https://github.com/comp55-fall18/git-team-lab-bees-bees-beeeees.git
		label.setColor(Color.green);
>>>>>>> branch 'master' of https://github.com/comp55-fall18/git-team-lab-bees-bees-beeeees.git
		add(label);
	}
}