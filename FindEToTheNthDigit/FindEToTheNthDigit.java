package FindEToTheNthDigit;

import java.util.Scanner;

public class FindEToTheNthDigit {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String e = "2.71828182845904523536028747135266249775724709369995";
		int decimalPlaces = -1;

		while (true) {
			try {
				System.out.print("Enter number of decimal places: ");
				decimalPlaces = Integer.parseInt(reader.nextLine());

				if (decimalPlaces >= 0 && decimalPlaces <= 50) break;
				System.out.println("Must be between 0 to 100\n");
				
			} catch (Exception ex) {
				System.out.println("Must be an integer between 0 to 100\n");
			}
		}

		if (decimalPlaces == 0) decimalPlaces--;
		// without this line of code, at 0 decimal places, "3." would be printed instead of "3"
		
		System.out.println("e: " + e.substring(0, decimalPlaces + 2));

		// BigDecimal pi = new BigDecimal(String of pi); if the number is needed for calculations
	}

}
