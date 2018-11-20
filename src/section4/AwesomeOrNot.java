package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		int x=new Random().nextInt(4);
		String awesome;
		JOptionPane.showMessageDialog(null, "The random integer was "+ x);
		awesome=JOptionPane.showInputDialog("Type whatever you think is awesome");
		if(x==0) {
			JOptionPane.showMessageDialog(null, "I think "+ awesome+" is awesome!");
		}
		else if(x==1) {
		    JOptionPane.showMessageDialog(null, "I think "+ awesome+" is okay");
		}
		else if(x==2) {
			JOptionPane.showMessageDialog(null,"I think "+ awesome+" is boring");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"I think" + awesome+ " is horrible");
		}

		
	}

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


