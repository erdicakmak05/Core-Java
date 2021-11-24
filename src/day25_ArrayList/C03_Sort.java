package day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> isimler = new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler); //[Kutlu, Emrah, Ferhat]
		
		Collections.sort(isimler);  // Küçükten büyüğe sıralama yapar.
		
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu]
		
		isimler.add("filiz");
		
		Collections.sort(isimler);
		
		System.out.println(isimler);
		
		
		

	}

}
