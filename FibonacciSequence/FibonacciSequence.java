package FibonacciSequence;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter nth Number: ");
		int nthNumber = Integer.parseInt(reader.nextLine());
		
		int num1 = 0;
		int num2 = 1;

		System.out.print("1");
		for (int i = 0; i < nthNumber; i++) {
			// System.out.print(fibonacciSequence(i) + " ");
			
			if (i % 2 == 0) {
				num1 += num2;
				System.out.print(" " + num1);
				continue;
			}
			
			num2 += num1;
			System.out.print(" " + num2);
		}
		
	}
	
//	private static int fibonacciSequence(int i) {
//		if (i > 1) return fibonacciSequence(i - 1) + fibonacciSequence(i - 2);
//		return 1;
//	}
}
