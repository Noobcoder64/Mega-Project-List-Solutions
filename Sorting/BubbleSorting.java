package Sorting;

import java.util.Arrays;

public class BubbleSorting {

	public static void main(String[] args) {
		String[] names = new String[] { "Luke", "Ban", "Maerty", "Amy", "Carl", "Sert", "Syke", "Charles" };
		
		String[] bubbleSorted = Sort(names);
		String[] mergeSorted;
				
		System.out.println(Arrays.toString(bubbleSorted));
	}
	
	static String[] Sort(String[] list) {
		boolean hasSwapped = true;
		String temp;
		
		while (hasSwapped) {
			hasSwapped = false;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i].compareTo(list[i+1]) > 0) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
		return list;
	}
	
	static void mergeSort(String[] list) {
		
		
		
	}
	
}
