package modules1;

import javax.swing.JOptionPane;
public class WordCount {
	public static void GetString() {
		String userInput;
		JOptionPane.showMessageDialog(null,"This portion will tell how many words are in the string and/or sentence");
		userInput = JOptionPane.showInputDialog("Please enter a string");
		JOptionPane.showMessageDialog(null,userInput.split("\\W+").length);
	}
}
