package NextPrimeNumber;

import java.util.Scanner;

public class NextPrimeNumber {
 
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Keep pressing enter to display the next prime number");
		System.out.println("Type 'stop' to exit the program...");
		
		int primeNumber = 0;
		while (true) {
			
			if (reader.nextLine().equals("stop")) break;

			primeNumber = nextPrimeNumber(primeNumber);
			System.out.print(primeNumber + " ");
		}
		
	}
	
	private static boolean isPrimeNumber(int num) {
		for (int i = 2; i < num / 2 + 1; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	private static int nextPrimeNumber(int num) {
		while (true) {
			num++;
			if (isPrimeNumber(num)) return num;
		}
	}

}
