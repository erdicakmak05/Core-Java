package day44_Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator {

	public static void main(String[] args) {
		List<Integer> liste = new ArrayList<>();

		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(4);
		liste.add(2);
		
		System.out.println(liste);
		
		Iterator ite1 = liste.iterator();
		
		
		ite1.next();
		ite1.next();
		ite1.next();
		System.out.println(ite1.next());
		
		ite1.remove();
		
		//System.out.println(ite1.remove()); 
		System.out.println(liste);
	}

}
