package CheckIfPalindrome;

import java.util.Scanner;

public class CheckIfPalindrome {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		
		String reverse = new StringBuilder(word).reverse().toString();
		
		if (word.equals(reverse)) System.out.println(word + " is a palindrome");
		else System.out.println(word + " is not a palindrome");
	}
}
