package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	Robot walle= new Robot();
	
	void go() {
		walle.setSpeed(100);

		// 4. make a variable to hold the length of the triangle and set it to 50
        int x=50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times

			// 9. Change the color of the pen to a random color
	
			// 8. Increase the length variable by 10
	
			// 5. call your drawTriangle() method using your length variable
	
			// 10. Turn the robot 6 degrees to the right
        for (int i = 0; i <60;i++) {
        	walle.penDown();
        	walle.setRandomPenColor();
        	x=x+10;
        	walle.turn(6);
        	drawTriangle(x);
        	
			
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
