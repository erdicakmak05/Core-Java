package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {

		// Kullanidan 2 kelime isteyin.
		// iki farklý method oluþturun. Methodlardan biri girilen kelimeleri
		// birleþtirsin
		// ilk harfler büyük diðerleri kucuk olacak þekilde birleþtirin.
		// ikinci method ism ve soyismin ilk harflerini büyük,
		// kalan harfler * olacak sekilde birleþtirsin.

		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde
		// kullanin

		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý giriniz.");
		String ad = scan.next();

		System.out.println("Soyadýnýzý Girin.");
		String soyad = scan.next();

		System.out.println("Ýsminizin açýk þekilde yazýlmasýný istiyorsanýz 1 e, ilk har hariç"
				+ "gizli yazýlmasýný istiyorsanýz 2 ye basýn.");
		int tercih = scan.nextInt();

		String birlesmisIsim = null;

		if (tercih == 1) {
			birlesmisIsim = birlestir(ad, soyad);
		} else if (tercih == 2) {
			birlesmisIsim = isimGizle(ad, soyad);
		} else {
			System.out.println("Lütfen 1 veya 2 yi seçin");
		}
		
        System.out.println("kullanicinin tercihi : " + birlesmisIsim);
        scan.close();

	}

	public static String isimGizle(String ad, String soyad) {
		ad = ad.toUpperCase().charAt(0) + ad.substring(1, ad.length()).replaceAll("\\w", "*");
		soyad = soyad.toUpperCase().charAt(0) + soyad.substring(1, soyad.length()).replaceAll("\\w", "*");

		return ad + " " + soyad;
	}

	public static String birlestir(String ad, String soyad) {

		String adSoyad = ad.toUpperCase().charAt(0) + ad.substring(1, ad.length()) + " " + soyad.toUpperCase().charAt(0)
				+ soyad.substring(1, soyad.length());
		ad = ad.toUpperCase().charAt(0) + ad.substring(1, ad.length());
		soyad = soyad.toUpperCase().charAt(0) + soyad.substring(1, soyad.length());

		return ad + " " + soyad;
	}

}
