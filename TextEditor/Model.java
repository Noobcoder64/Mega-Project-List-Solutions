package TextEditor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Model {
	private String text;
	
	public void saveFile() throws IOException {
		PrintWriter printWriter = new PrintWriter(new FileWriter("src/TextEditor/test.txt"));
		printWriter.print(text);
		printWriter.close();
	}
	
	public void openFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src/TextEditor/test.txt"));
		StringBuilder builder = new StringBuilder();
		while (scanner.hasNext()) {
			builder.append(scanner.nextLine() + "\n");
		}
		scanner.close();
		text = builder.toString();
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
}
