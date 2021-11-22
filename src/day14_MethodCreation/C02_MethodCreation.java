package day14_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// Kullanicidan iki say� isteyin
		// sayilarin karelerini ve k�plerini toplayan iki ayr� metkod yazd�r�n
		// kullaniciya �s sorun 
		// 2 yazarsa kareleri toplam�n� yapan method 3 yazarsa k�pler toplam�n� yapan method calissin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz");
		int sayi2 = scan.nextInt();
		System.out.println("Karelerinin toplam�n� istiyorsan�z 2'e k�plerinin toplam�n� istiyorsan�z 3 ye bas�n.");
		int ustu = scan.nextInt();
		
		if (ustu==2) {
			karelerinToplami(sayi1, sayi2);
		} else if (ustu==3) {
			kuplerinToplami(sayi1,sayi2);
		} else {
			System.out.println("Ge�ersiz giri� yapt�n�z.");
		}
		
		scan.close();
		
	}

	public static void kuplerinToplami(int sayi1, int sayi2) {

		System.out.println("K�plerinin toplam� = " + (Math.pow(sayi1, 3)+Math.pow(sayi2, 3)));
	}

	public static void karelerinToplami(int sayi1, int sayi2) {

		System.out.println("Karelerinin toplam� = " + (Math.pow(sayi1, 2)+Math.pow(sayi2, 2)));

	}

}
