package ChangeReturnProgram;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChangeReturnProgram {
	private static Map<String, Integer> returnMoney = new HashMap<String, Integer>();
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter price of item: ");
		BigDecimal costOfItem = reader.nextBigDecimal();
		System.out.print("Enter money given: ");
		BigDecimal givenMoney = reader.nextBigDecimal();
		
		processChange(givenMoney.subtract(costOfItem));
		
		for (String string : returnMoney.keySet()) {
			System.out.println(string + ": " + returnMoney.get(string));
		}
	}

	private static void processChange(BigDecimal changeRequired) {
		if (changeRequired.compareTo(new BigDecimal("0.25")) >= 0) {
			increment("Quarter(s)");
			processChange(changeRequired.subtract(new BigDecimal("0.25")));
			
		} else if (changeRequired.compareTo(new BigDecimal("0.1")) >= 0) {
			increment("Dime(s)");
			processChange(changeRequired.subtract(new BigDecimal("0.1")));
			
		} else if (changeRequired.compareTo(new BigDecimal("0.05")) >= 0) {
			increment("Nickel(s)");
			processChange(changeRequired.subtract(new BigDecimal("0.05")));
			
		} else if (changeRequired.compareTo(new BigDecimal("0.01")) >= 0) {
			increment("Pennies");
			processChange(changeRequired.subtract(new BigDecimal("0.01")));
			
		} else return;
	}
	
	private static void increment(String str) {
		if (returnMoney.get(str) == null) returnMoney.put(str, 0);
		returnMoney.replace(str, returnMoney.get(str) + 1);
	}
	
}
