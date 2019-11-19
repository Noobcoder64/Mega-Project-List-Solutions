package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSorting {
	public static void main(String[] args) {
		Integer[] numbers = new Integer[] { 3, 6, 5, 9, 1, 4, 2, 7, 8 };
		
		Integer[] mergeSorted = Sort(numbers);
		
		System.out.println(Arrays.toString(mergeSorted));
	}
	
	static Integer[] Sort(Integer[] list) {
		MyQueue<Integer> numbers = new MyQueue<Integer>(list);
		
		mergeSort(numbers);
		return numbers.stream().mapToInt(i -> i).boxed().toArray(Integer[]::new);
	}
	
	static void mergeSort(MyQueue<Integer> queue) {
		if (queue.size() < 2) return;
		
		MyQueue<Integer> leftQueue = queue.left();
		MyQueue<Integer> rightQueue = queue.right();
		
		mergeSort(leftQueue);
		mergeSort(rightQueue);
		
		queue.clear();
		
		merge(queue, leftQueue, rightQueue);
	}

	static void merge(MyQueue<Integer> queue, MyQueue<Integer> leftQueue, MyQueue<Integer> rightQueue) {
		while (!leftQueue.isEmpty() && !rightQueue.isEmpty()) {
			if (leftQueue.peek() < rightQueue.peek()) queue.push(leftQueue.pop());
			else queue.push(rightQueue.pop());
		}
		
		queue.pushAll(leftQueue);
		queue.pushAll(rightQueue);
		
	}

	
}
