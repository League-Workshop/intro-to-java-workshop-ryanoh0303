package section4;
import javax.swing.JOptionPane;
public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		
		// 2.  Ask the user a question 
		String answer;
		String answer2;
		String answer3;
		answer=JOptionPane.showInputDialog("How many states are there in the United States of America?");
	
		
		if(answer.equalsIgnoreCase("50")) {
			JOptionPane.showMessageDialog(null,"Congratulations. You got it right. Moving on to the next question!");
			score=score+1;
			JOptionPane.showMessageDialog(null,"Your current score is "+ score);
			answer2=JOptionPane.showInputDialog("In which party is Donald Trump located in?");
			if(answer2.equalsIgnoreCase("Republican")) {
				score=score+1;
				JOptionPane.showMessageDialog(null,"You got it right again! Your current score is "+ score);
				answer3=JOptionPane.showInputDialog("In which continent is Mexico located in?");
				if(answer3.equalsIgnoreCase("South America")) {
					score=score+1;
					JOptionPane.showMessageDialog(null,"You got all of the questions right! Your total score was "+ score);
				}
				else {
					JOptionPane.showMessageDialog(null, "You got it wrong. Your final score is "+ score);
				}
					
			}
			else {
				JOptionPane.showMessageDialog(null,"Ah.. So close. The answer was Republican");
				JOptionPane.showMessageDialog(null,"Your final score was "+ score);
			}

		}
		else {
			JOptionPane.showMessageDialog(null,"You got the question wrong. The answer was 50.");
		}
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
