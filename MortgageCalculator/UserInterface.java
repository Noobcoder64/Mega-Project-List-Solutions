package MortgageCalculator;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
	private JFrame frame;
	private Calculator calculator;
	
	public UserInterface(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void run() {
		frame = new JFrame("Mortage Calculator");
		frame.setPreferredSize(new Dimension(400, 400));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		createComponents(frame.getContentPane());
		
		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {
		container.setLayout(new GridLayout(5, 2));
		
		// LOAN AMOUNT
		container.add(new JLabel("Loan amount: £"));
		JTextField loanAmount = new JTextField();
		container.add(loanAmount);
//		calculator.setLoanAmount(Double.parseDouble(loanAmount.getText()));
		
		// INTEREST RATE
		container.add(new JLabel("Interest rate: %"));
		JTextField interestRate = new JTextField();
		container.add(interestRate);
//		calculator.setInterestRate(Double.parseDouble(interestRate.getText()));
		
		// MORTAGE TERMS
		container.add(new JLabel("Mortage terms: "));
		
		JPanel mortageTerms = new JPanel();
		mortageTerms.setLayout(new GridLayout(2, 4));
		mortageTerms.add(new JLabel("Days"));
		mortageTerms.add(new JLabel("Weeks"));
		mortageTerms.add(new JLabel("Months"));
		mortageTerms.add(new JLabel("Years"));
		JTextField days = new JTextField("0");
		JTextField weeks = new JTextField("0");
		JTextField months = new JTextField("0");
		JTextField years = new JTextField("0");
		mortageTerms.add(days);
		mortageTerms.add(weeks);
		mortageTerms.add(months);
		mortageTerms.add(years);

		container.add(mortageTerms);
//		calculator.setMortageTerms(daysValue, weeksValue, monthsValue, yearsValue);
		
		// FREQUENCY
		container.add(new JLabel("Frequency: "));
		JComboBox<Frequency> interestFrequency = new JComboBox<>(Frequency.values());
		container.add(interestFrequency);
//		calculator.setInterestFrequency(interestFrequency.getSelectedItem());
		
		// RESULT
		JLabel result = new JLabel();
		container.add(result);
		
		// CALCULATE
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener((event) -> {
				int daysValue = Integer.parseInt(days.getText());
				int weeksValue = Integer.parseInt(weeks.getText());
				int monthsValue = Integer.parseInt(months.getText());
				int yearsValue = Integer.parseInt(years.getText());
				
				
				
				calculator.setLoanAmount(Double.parseDouble(loanAmount.getText()));
				calculator.setInterestRate(Double.parseDouble(interestRate.getText()));
				calculator.setMortageTerms(daysValue, weeksValue, monthsValue, yearsValue);
				calculator.setInterestFrequency(interestFrequency.getSelectedItem());
				
				result.setText(String.valueOf(calculator.getInterestAmount()));
			});

		container.add(calculate);
		
		container.add(result);
	}

}

//	Integer[] range = IntStream.rangeClosed(1, 30).boxed().toArray(Integer[]::new);
