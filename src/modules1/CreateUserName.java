package modules1;

import javax.swing.JOptionPane;
public class CreateUserName {
	public static void GetFullName() {
		String fullName;
		String streetAddress;
		StringBuilder userName = new StringBuilder();
		String[] initials;
		String[] usablePartOfAddress;
		JOptionPane.showMessageDialog(null, "This portion will accept your name and full street address\nit will then create a username");
		fullName = JOptionPane.showInputDialog("What is your full name?");
		initials = fullName.split(" ");
		for(String word: initials) {
			userName.append(word.substring(0, 1).toUpperCase());
		}
		System.out.println();
		streetAddress = JOptionPane.showInputDialog("What is your full street address? Ex. 1234 Jackson Street");
		usablePartOfAddress = streetAddress.split(" ");
		for(char letter: usablePartOfAddress[0].toCharArray()) {
			if(Character.isDigit(letter)) {
				userName.append(letter);
			}
		}
		JOptionPane.showMessageDialog(null, userName);
	}
}
