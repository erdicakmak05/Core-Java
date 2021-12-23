package day46_Collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q01 {

	public static void main(String[] args) {

		Set <Integer> setlist = new HashSet<>();
				
		LocalTime baslangic =  LocalTime.now();
		for (int i = 0; i < 100; i++) {
			setlist.add((int) (Math.random()*100));
		}
		LocalTime bitis = LocalTime.now();
		
		System.out.println(bitis.getNano()-baslangic.getNano());
		
		System.out.println(setlist);
		
		Set <Integer> treeList = new TreeSet<>();
		
		LocalTime baslangicT = LocalTime.now();
		
		for (int i = 0; i < 100; i++) {
			treeList.add((int) (Math.random()*100));
		}
		
		LocalTime bitisT = LocalTime.now();
		
		System.out.println(bitisT.getNano()-baslangicT.getNano());
		
		System.out.println(treeList);
		
	}

}
