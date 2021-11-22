package day17_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum
		// tamsayilari
		// toplayip, sonucu yazdiran bir program yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz");
		int sayi1 = scan.nextInt();

		System.out.println("İkinci sayiyi giriniz.");
		int sayi2 = scan.nextInt();

		int kucuk = 0;
		int buyuk = 0;

		if (sayi1 > sayi2) {
			buyuk = sayi1;
			kucuk = sayi2;
		} else {
			buyuk = sayi2;
			kucuk = sayi1;
		}
		
		int toplam = 0;
		
		for (int i = kucuk; i <= buyuk; i++) {
			toplam+=i;
		}
		System.out.println("Girilen sayılar ve aralarındaki sayıların toplamı = " + toplam);
	}

}
