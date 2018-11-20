package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String z;
		speak("Do you know how to code?");
		z=JOptionPane.showInputDialog("Do you know how to write code?");
		if(z.equalsIgnoreCase("Yes")) {
			speak("You will conquer the world.");
			JOptionPane.showMessageDialog(null, "You will rule the world");
			
		}
		else{
			speak("Good luck to you washing dishes in the near future");
			JOptionPane.showMessageDialog(null,"I wish good luck to you washing dishes");
		
			
		}

		// 2. If they say "yes", tell them they will rule the world.

		// 3. Otherwise, wish them good luck washing dishes.

	}
	
	
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}



