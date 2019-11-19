package FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			System.out.print(fizzBuzz(i) + " ");
		}

	}
	
	private static String fizzBuzz(int i) {
		if (i % 15 == 0) return "FizzBuzz";
		if (i % 3 == 0) return "Fizz";
		if (i % 5 == 0) return "Buzz";
		return String.valueOf(i);
	}

	// Predicates, IntFunction
}
