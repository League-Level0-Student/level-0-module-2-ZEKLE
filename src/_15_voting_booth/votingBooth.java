package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Whats your age?");
		int num = Integer.parseInt(age);
		if (num > 17) {
			JOptionPane.showInputDialog(null, "Who do you vote for?");
		} else {
		if (num < 17) {
		JOptionPane.showMessageDialog(null, "You can not vote.");
		}
		}

}
}