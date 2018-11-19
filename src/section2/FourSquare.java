package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot walle=new Robot();

	void go() {
		walle.setSpeed(250);
		walle.penDown();

		// 5. Set the pen width to 5
		walle.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			walle.setRandomPenColor();
			walle.turn(90);
			
		}

			// 7. Set the pen color to random
	
			drawSquare();
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		walle.penDown();
		for (int i = 0; i <4; i++) {
			walle.setRandomPenColor();
			walle.move(200);
			walle.turn(90);
			
		}
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



