
package PigLatin;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = reader.nextLine();
		reader.close();
		
		String pigLatin = Stream.of(word.split(" ")).map(str -> str.substring(1) + str.charAt(0) + "ay").collect(Collectors.joining(" ")).toString();
		
		System.out.println(pigLatin);
	}
}
