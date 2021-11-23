package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> harfler = new ArrayList<>();
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);
		
		System.out.println(harfler.remove(1));  // Z
		
		System.out.println(harfler); // [A, F, D]
		
		System.out.println(harfler.remove(2)); // D
		
		System.out.println(harfler); // A F
		
		System.out.println(harfler.remove("F")); // F yi remove eder true döndürür.
		
		System.out.println(harfler.remove("B")); // listede B olmadığı için remove yapamaz
												 // Görevini yapmadığı için false döner
		
		System.out.println(harfler);
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		
		System.out.println(harfler); //[A, A, Z, F]

		System.out.println(harfler.remove("A")); // true  --> ilk bulduğu A yi sildi.
		
		harfler.add("A");
		
		harfler.removeAll(harfler);
		
		System.out.println(harfler);
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler = new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler);
		System.out.println(silinecekHarfler);
		
		System.out.println(harfler.removeAll(silinecekHarfler));

	}

}
