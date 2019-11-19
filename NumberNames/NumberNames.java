package NumberNames;

import java.util.Scanner;

public class NumberNames {
	static String[] lastdigit = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
	static String[] allteen = new String[] { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	static String[] allten = new String[] { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	static String[] more = new String[] { "", "Thousand", "Million", "Billion", "Trillion", "Quadrillion" };
		
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = reader.nextInt();
		
		String numberName = "";
		
		int index = 0;
		while (number > 0) {
			if (number % 1000 != 0)
				numberName = everyHundreds(number % 1000) + " " + more[index] + numberName;
			number /= 1000;
			index++;
		}
		
		System.out.print("Number name: " + numberName);
	}
	
	static String everyHundreds(int num) {
		  String output = "";

		    if (num >= 100) {
		        output += lastdigit[num/100] + " Hundred ";
		        num %= 100;
		    }

		    if (num >= 11 && num <= 19) { 
		        output += allteen[num-10] + " ";
		    } else if (num >= 20 || num == 10) {
		        output += allten[num/10] + " ";
		        num %= 10;
		    }

		    if (num >= 1 && num <= 9) {
		        output += lastdigit[num] + " ";
		    }

		    return output;
	}
}
