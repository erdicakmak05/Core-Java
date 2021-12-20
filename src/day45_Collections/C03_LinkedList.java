package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();

		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);
		System.out.println(ll.peek()); // silmeden ilk elemanı getirir.
		System.out.println(ll.peekFirst());
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		System.out.println(ll2.peekFirst());
		

	}

}
