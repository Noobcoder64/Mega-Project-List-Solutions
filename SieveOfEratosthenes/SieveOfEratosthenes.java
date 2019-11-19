package SieveOfEratosthenes;

import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = reader.nextInt();
		
		boolean[] isPrime = new boolean[n-1];
		
		for (int i = 0; i < n-1; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i <= n; i++) {
			if (isPrime[i - 2]) System.out.print(i + " ");
			
			for (int j = i*i; j <= n; j += i) {
				isPrime[j - 2] = false;
			}
		}
		
	}

}
