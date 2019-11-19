package AlarmClock.Components;

public class BoundedCounter {
	private int value;
	private int upperLimit;
	
	public BoundedCounter(int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment() {
		this.value = (this.value + 1) % upperLimit;
	}
	
	public void decrement() {
		this.value = (this.value - 1 + upperLimit) % upperLimit;
	}
	
	public boolean valueIsZero() {
		return this.value == 0 ? true : false;
	}
	
	@Override
	public String toString() {
		return this.value < 10 ? "0" + this.value : String.valueOf(this.value);
	}
	
}
