package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {

		List<String> isimler = new ArrayList<>();
		
		System.out.println("Boş Liste : " + isimler);
		
		isimler.add("Ali");
		
		System.out.println("Bir Elemanli : "+isimler);
		
		isimler.add("Veli");
		
		System.out.println("İki eleman : " + isimler);
		// add method u listenin sonuna ekleme yapar.
		
		isimler.add("Can");
		
		System.out.println("Üçüncü Eleman : " + isimler);
		
		isimler.add(1, "Ayse");
		
		System.out.println("1. indekse ayse ekledik : " + isimler);
		
		//isimler.add(5); declare ederken belirttiğimiz data turu dısında vir data turunden ekleme yapamayız.
		
		String ad = "Erdi";
		
		isimler.add(ad);
		
		System.out.println(isimler);
		
		List <String> liste2 = new ArrayList<>();
		
		liste2.add("Gunter");
		
		liste2.add("Emrah");
		
		System.out.println("Liste 2 : " +liste2);
		
		isimler.addAll(liste2);
		
		System.out.println(isimler);
	}

}
