package CountWordsInAString;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter name of file: ");
		String filename = scanner.nextLine();
		scanner.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/CountWordsInAString/" + filename + ".txt"));
		
		StringBuilder whole = new StringBuilder();
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			whole.append(line);
			whole.append("\n");
		}
		bufferedReader.close();
		
		int words = whole.toString().split(" |\n").length;
		System.out.println("There are " + words + " words");
	}

}
