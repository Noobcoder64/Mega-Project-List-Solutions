package MortgageCalculator;

import javax.swing.SwingUtilities;

public class MortgageCalculator {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();		
		UserInterface ui = new UserInterface(calculator);
		SwingUtilities.invokeLater(ui);
	}
	
}
