package FindCostofTile;

import java.util.Scanner;

public class FindCostofTile {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter width of floor: ");
		Double width = reader.nextDouble();
		
		System.out.print("Enter height of floor: ");
		Double height = reader.nextDouble();
		
		System.out.print("Enter cost of a tile: £");
		double costOfTile = reader.nextDouble();
		
		System.out.println("Total cost: " + String.format("%.2f", (width * height * costOfTile)));
		
	}
	
}
