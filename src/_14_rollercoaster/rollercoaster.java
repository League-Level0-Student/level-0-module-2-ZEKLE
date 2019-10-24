package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you?");
		int num = Integer.parseInt(height);
		if (num > 48) {
			JOptionPane.showMessageDialog(null, "You can go on the roller coaster");
		} else {
		if (num < 48);{
			JOptionPane.showMessageDialog(null, "Im sorry you cant go on the roller coaster");
		}
	}
}
}