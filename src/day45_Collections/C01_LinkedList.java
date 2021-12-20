package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		System.out.println(ll);
		
		ll.add(5);
		ll.add(7);
		System.out.println(ll);
		
		// linked list'in iki tane interface parent i vardır
		// birisi list, oteki deque ==> Queue
		
		ll.add(0,10); // List interface'den gelen özellikle basa eleman ekleme.
		System.out.println(ll);
		
		ll.addFirst(3);
		
		LinkedList<Integer> ll2 = new LinkedList<>();
		
		ll2.addAll(ll);
		
		System.out.println(ll2);
		
		ll2.addAll(2, ll);
		
		System.out.println(ll2);
		

	}

}
