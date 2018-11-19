package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		Robot walle= new Robot();
		walle.setSpeed(100);
		walle.penDown();
	 
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		walle.turn(90);
		walle.move(100);
		
	}
}
