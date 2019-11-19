package FastExponentiation;

import java.util.Scanner;

public class FastExponentiation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x = reader.nextDouble();
		
		System.out.print("Enter y: ");
		int y = reader.nextInt();
		
		System.out.println("x^y = " + power(x, y));
	}

	static double power(double x, int y) {
		if (y == 0) return 1;
		if (y == 1) return x;
		
		double d = power(x, y / 2);
		
		if (y % 2 == 0) return d*d;
		else return d*d*x;
	}
	
}
