package day15_MethodCreation;

import java.util.Scanner;

public class C01_MethodCreation {

	public static void main(String[] args) {

		// Kullanidan 2 kelime isteyin.
		// iki farkl� method olu�turun. Methodlardan biri girilen kelimeleri
		// birle�tirsin
		// ilk harfler b�y�k di�erleri kucuk olacak �ekilde birle�tirin.
		// ikinci method ism ve soyismin ilk harflerini b�y�k,
		// kalan harfler * olacak sekilde birle�tirsin.

		// kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan ksminda isim ve soyismi kullanicinin istedigi sekilde
		// kullanin

		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz.");
		String ad = scan.next();

		System.out.println("Soyad�n�z� Girin.");
		String soyad = scan.next();

		System.out.println("�sminizin a��k �ekilde yaz�lmas�n� istiyorsan�z 1 e, ilk har hari�"
				+ "gizli yaz�lmas�n� istiyorsan�z 2 ye bas�n.");
		int tercih = scan.nextInt();

		String birlesmisIsim = null;

		if (tercih == 1) {
			birlesmisIsim = birlestir(ad, soyad);
		} else if (tercih == 2) {
			birlesmisIsim = isimGizle(ad, soyad);
		} else {
			System.out.println("L�tfen 1 veya 2 yi se�in");
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
