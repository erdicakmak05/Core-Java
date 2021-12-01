package day29_StaticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {

		// bir list olusturalım 
		// sonra list elemanlarini değiştir metodu yazıp orada 
		// list elemanlarindan bazılarını değiştirelim
		// method void olsun main methoda döndükten sonra yeniden list'i yazdıralım.
		
		List<String> harfler = new ArrayList<>();
		
		//String arr[] = {"A","B","C"};
		
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");

		
		listElemanlarDegistir(harfler);
		System.out.println("Main metod içinde harfler listi : "+ harfler);
		
		// Javada list ve Array gibi objeler içinde pass bu value geçerlidir.
		// yani farklı bir metotda array veya liste yeni değer ataması yaparsanız.
		// orjinal array veya list değişmez.

		listDegistir(harfler); // method'a yeni değer atadığım halde harfler listesi değişmedi.
		System.out.println("Liste yeni list atadıktan sonra main metoda dönünce list -> " + harfler);
		
	}

	private static void listDegistir(List<String> harfler) {

		harfler = new ArrayList<>();
		System.out.println("Liste yeni değer atayınca"+harfler);
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Metod içinde harfler listi : "+ harfler);
	}

}
