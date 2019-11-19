package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MyQueue<E> extends ArrayList<E> {
	
	public MyQueue() {
		super();
	}

	public MyQueue(E[] list) {
		for (int i = 0; i < list.length; i++) {
			push(list[i]);
		}
	}

	public MyQueue(List<E> list) {
		for (E e : list) {
			push(e);
		}
	}

	public void push(E object) {
		add(object);
	}
	
	public void pushAll(MyQueue<E> myQueue) {
		for (E e : myQueue) {
			this.push(e);
		}
	}
	
	public E pop() {
		E object = get(0);
		remove(0);
		return object;
	}
	
	public E peek() {
		return get(0);
	}
	
	public MyQueue<E> left() {
		return subList(0, size() / 2);
	}
	
	public MyQueue<E> right() {
		int size = size();
		return subList(size / 2, size);
	}
	
	@Override
	public MyQueue<E> subList(int fromIndex, int toIndex) {
		return new MyQueue<E>(super.subList(fromIndex, toIndex));
	}
	
}
