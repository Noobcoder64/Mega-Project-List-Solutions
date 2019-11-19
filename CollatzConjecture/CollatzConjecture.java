package CollatzConjecture;

import java.util.Scanner;

public class CollatzConjecture {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = reader.nextInt();
		
		int noOfSteps = 0;
		
		while (n > 1) {
			if (n % 2 == 0) n /= 2;
			else n = (n * 3) + 1;
			noOfSteps++;
		}
		System.out.println("Number of steps: " + noOfSteps);
	}

}
