package day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {

		String isimler[] = {"Hacer","ainagul","Emine","Murat","Kutlu"};
		
		// İsimler array'inde Murat ismi var mi ?
		
		// array'de arama yapmadan önce sıralama ( Arrays.sort) yapmalıyız.
		
		Arrays.sort(isimler); // atama olmasada değişiklik yapılır , alfabetik sıra yaptı.
		
		System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, ainagul]

		// sort metodu elementleri natural order'a göre sıralar.
		
		isimler[4]="Ainagul";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		
		System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4
		System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5
		System.out.println(Arrays.binarySearch(isimler, "Tuba"));  // -6
		System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4


	}

}
