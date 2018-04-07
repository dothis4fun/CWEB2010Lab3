package modules1;
import javax.swing.JOptionPane;
public class GetPhoneNumber {
	
	public static void GetNumbers() {
		String phoneNumber;
		JOptionPane.showMessageDialog(null, "This portion will accept 10 digits and create a phone number");
		do {
			phoneNumber = JOptionPane.showInputDialog("Enter your 10 digit phone number with no spaces (Ex. 6125144244 )");
			while(phoneNumber.length() != 10 || !isStringNumbers(phoneNumber)) {
				phoneNumber = JOptionPane.showInputDialog("Please enter only 10 numbers with no spaces");
			}
			phoneNumber = "(" + phoneNumber.substring( 0,3 ) + ")" + phoneNumber.substring( 3,6 ) + "-" + phoneNumber.substring( 6,10 );
			JOptionPane.showMessageDialog(null, "Your phone number is " + phoneNumber);
		}while(shouldContinue());
	}
	public static boolean isStringNumbers(String stringToTest) {
		boolean allDigits = true;
		for(char letter : stringToTest.toCharArray()) {
			if(!Character.isDigit(letter)) {
				allDigits = false;
				break;
			}
		}
		return allDigits;
	}
	
	public static boolean shouldContinue() {
		String userInput;
		userInput = JOptionPane.showInputDialog("Press any key/s other than '999' to continue");
		if(userInput.equals("999")) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
