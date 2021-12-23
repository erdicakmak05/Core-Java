package day46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_HashSet {

	public static void main(String[] args) {
		// Verilen bir Array'deki  tekrar eden sayilari siniğ
		// yerine unique değerler veren bir array olusturun.
		
		int arr [] = {3,4,5,6,8,4,1,2,3,6,8,5,6,8,5,2,3};
		
		Set<Integer> benzersizSet = new HashSet<>();
		
		for (Integer each : arr) {
			benzersizSet.add(each);
		}
		
		System.out.println(benzersizSet);
		
		Object[] tekrarsizArr = benzersizSet.toArray();
		
		System.out.println(Arrays.toString(tekrarsizArr));
	}

}
