package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// Verilen bir listede , içinde belirli bir harf olan elemanları
		// silen bir method yazınız.
		
		List <String> str = new ArrayList<>();
		
		str.add("Jeyhun");
		str.add("Yıldız");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		
		System.out.println(str);  // [Jeyhun, Yıldız, Mustafa, Tugba, Turgut]
		
		String silinecekHarf= "a";
		
		System.out.println(str.get(2).contains("a"));
		System.out.println(str.get(3).contains("a"));
	
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains("a")) {
				
				str.remove(i);
				i--;
			}
		}
		
		

		
		System.out.println(str);

	}

}
