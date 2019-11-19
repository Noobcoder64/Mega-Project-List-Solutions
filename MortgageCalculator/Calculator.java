package MortgageCalculator;

public class Calculator {
	private double loanAmount;
	private double interestRate;
	private int mortageTerms;
	private Frequency interestFrequency;
	
	private double interestAmount;
	
	private void calculateInterestAmount()	{
		double interest = loanAmount * interestRate / 100;
		int interestMultiplier = mortageTerms / interestFrequency.getDays();
		
		this.interestAmount = interest * interestMultiplier;
	}
	
	public double getInterestAmount() {
		calculateInterestAmount();
		return interestAmount;
	}
	
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void setMortageTerms(int daysValue, int weeksValue, int monthsValue, int yearsValue) {
		this.mortageTerms = daysValue + weeksValue * 7 + monthsValue * 30 + yearsValue * 360;
	}
	
	public void setInterestFrequency(Object frequency) {
		this.interestFrequency = (Frequency) frequency;
	}
	
}
