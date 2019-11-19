package CoinFlipSimulation;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipSimulation {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random random = new Random();
		String choice = "";
		int randNo = 0;
		
		int headsCounter = 0;
		int tailsCounter = 0;
		
		System.out.println("Press enter to flip coin...");
		System.out.println("Type 'stop' to quit...");
		System.out.println("Type 'count' for number of heads and tails...");
		
		while (true) {
			System.out.print("\n> ");
			choice = reader.nextLine();
			
			if (choice.equals("stop")) break;
			
			if (choice.equals("count")) {
				System.out.println("Heads: " + headsCounter + " Tails: " + tailsCounter);
				continue;
			}
			
			System.out.print("Outcome: ");
			randNo = random.nextInt(2);
			if (randNo == 0) {
				System.out.println("Heads");
				headsCounter++;
			} else if (randNo == 1) {
				System.out.println("Tails");
				tailsCounter++;
			}
			
		}
			
			
			
		
		
	}

}
