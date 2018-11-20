package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		String word="dsjfalksdjflkajsdlfkjalsdjkfl";
		speak("Spell the word"+word);
		String x;
		
		x=JOptionPane.showInputDialog("");
		if(x.equalsIgnoreCase(word)) {
			speak("You spelled the word correct. Congratulations");
			JOptionPane.showMessageDialog(null, "Congratulations!");
	    
			
		}
		else {
			speak("You are stupid! How can you get that word wrong?");
			JOptionPane.showMessageDialog(null, "Stupid! You got it wrong!");
		}

		// 2. Catch the user's answer in a String

		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
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


