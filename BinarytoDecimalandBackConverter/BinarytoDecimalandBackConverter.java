package BinarytoDecimalandBackConverter;

import java.util.Scanner;

public class BinarytoDecimalandBackConverter {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Binary (B) or Denary (D)?: ");
		String choice = reader.nextLine().toUpperCase();
		
		if (choice.equals("B")) {
			System.out.print("Enter binary: ");
			String binary = reader.nextLine();
			System.out.println("Denary: " + BinaryToDenary(binary));
		
		} else if (choice.equals("D")) {
			System.out.print("Enter denary: ");
			int denary = reader.nextInt();
			System.out.println("Binary: " + DenaryToBinary(denary));
			
		}
		
	}
	
	public static long BinaryToDenary(String binary) {
		long denary = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(binary.length() - i - 1) == '1')
			denary += Math.pow(2, i);
		}
		
		return denary;
	}

	private static String DenaryToBinary(int denary) {
		StringBuilder binary = new StringBuilder();
		
		while (denary > 0) {
			binary.append(denary % 2);
			denary /= 2;
		}
		
		return binary.reverse().toString();
	}
	
}
