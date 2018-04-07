package modules1;

import javax.swing.JOptionPane;

public class PasswordValidation {
	
	public static void GetValidPassword() {
		String password;
		boolean containsDigit;
		boolean containsUppercase ;
		boolean validLength;
		JOptionPane.showMessageDialog(null, "This portion will validate a password to ensure\nit contains at least 6 but no more than 10 characters\nwith at least one uppercase letter");
		do {
			containsDigit = false;
			containsUppercase = false;
			validLength = false;
			System.out.println();
			password = JOptionPane.showInputDialog("Please enter your password");
			if(password.length() > 10) {
				JOptionPane.showMessageDialog(null,"The password is too long, maximum length of 10");
				validLength = false;
			}
			else if(password.length() < 6) {
				JOptionPane.showMessageDialog(null,"The password is too short, minimum length of 6");
				validLength = false;
			}
			else {
				validLength = true;
			}
			for(char letter: password.toCharArray()) {
				if(Character.isDigit(letter)) {
					containsDigit = true;
				}
				if(!Character.isDigit(letter) && Character.toUpperCase(letter) == letter) {
					containsUppercase = true;
				}
			}
			if(!containsDigit || !containsUppercase) {
				JOptionPane.showMessageDialog(null,"Your password must contain at least number and one uppercase letter");
			}
		}
		while(!containsDigit || !containsUppercase || !validLength);
		JOptionPane.showMessageDialog(null,"Valid Password of " + password);
	}
}
