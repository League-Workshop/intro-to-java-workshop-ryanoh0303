package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String name;
		name= JOptionPane.showInputDialog("What is your name?");
		System.out.println("Your name is "+ name);
		JOptionPane.showConfirmDialog(null, "Hello, "+ name);
		
		
		
	}

}
