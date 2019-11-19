package PrimeFactorization;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(reader.nextLine());
		
		System.out.print("Prime factors: 1");
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) System.out.print(" " + i);
		}
		System.out.println(" " + num);
	}

}
