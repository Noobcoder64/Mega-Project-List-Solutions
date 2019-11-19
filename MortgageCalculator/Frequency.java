package MortgageCalculator;

public enum Frequency {
	Daily(1), Weekly(7), Monthly(30), Annually(360);
	
	private int days;
	
	private Frequency(int days) {
		this.days = days;
	}
	
	public int getDays() {
		return days;
	}
	
}
