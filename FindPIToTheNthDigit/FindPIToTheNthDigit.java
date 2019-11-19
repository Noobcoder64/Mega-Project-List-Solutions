package FindPIToTheNthDigit;

import java.util.Scanner;

public class FindPIToTheNthDigit {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		int decimalPlaces = -1;

		while (true) {
			try {
				System.out.print("Enter number of decimal places: ");
				decimalPlaces = Integer.parseInt(reader.nextLine());
				
				if (decimalPlaces >= 0 && decimalPlaces <= 100) break;
				System.out.println("Must be between 0 to 100\n");
				
			} catch (Exception e) {
				System.out.println("Must be an integer between 0 to 100\n");
			}
		}

		if (decimalPlaces == 0) decimalPlaces--;
		
		System.out.println("Pi: " + pi.substring(0, decimalPlaces + 2));
		// without this line of code, at 0 decimal places, "3." would be printed instead of "3"
		
		// BigDecimal pi = new BigDecimal(String of pi); if the number is needed for calculations
	}

}
