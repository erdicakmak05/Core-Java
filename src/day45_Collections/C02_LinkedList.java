package day45_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_LinkedList {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();

		ll.add(5);
		ll.add(7);
		
		System.out.println(ll);
		
		ll.add(9); // Data türünü List seçtiğimiz icin sadece List Interface indeki metotlari kullanabiliriz.
				   // LinkedList class inda override ettiğimiz için.
				   // List Interface olmasina ragmen List metholarini kullabildik
		
		Queue<Integer> ll2 = new LinkedList<>();
		
		ll2.add(5);
		ll2.add(7);
		ll2.clear(); // Data turu Queue secilince Queue interface inden gelen metholaro kullanabildik.
		
		Deque <Integer> ll3 = new LinkedList<>();
		
		ll3.add(5);
		ll3.add(7);
		ll3.addLast(20); //
		
	}

}
