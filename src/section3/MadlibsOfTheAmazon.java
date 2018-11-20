package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a pirancha-infested river, here's how to do it...");
		String n;
		String liquid;
		String bodypart;
		String verb;
		String place;
		n=JOptionPane.showInputDialog("Enter an adjective");
		liquid=JOptionPane.showInputDialog("Enter a type of liquid");
		bodypart=JOptionPane.showInputDialog("Enter a body part");
		verb=JOptionPane.showInputDialog("Enter a verb");
		place=JOptionPane.showInputDialog("Enter a place");
		
		System.out.println("Piranhas are more "+ n+" during the day, so cross the river at\n"+"night. Piranhas are attracted to fresh "+ liquid+" and will most\n");
		
	
		System.out.println("likely take a bite out of your " + bodypart+" if you "+verb+" . Whatever\n"+"you do, if you have an open wound, try to find another way to get\n");
		System.out.println(" back to the "+place+" . Good luck"
);
		
		
		
		
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

