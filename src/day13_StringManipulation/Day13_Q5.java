package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q5 {

	public static void main(String[] args) {

		//Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz");
		String ad = scan.next();
		
		System.out.println("Soyad�n�z� giriniz");
		String soyad = scan.next();
		
		if (ad.length()>soyad.length()) {
			System.out.println("Ad�n�z soyad�n�zdan uzun");
		} else if (soyad.length()>ad.length()) {
			System.out.println("Soyad�n�z ad�n�zdan uzun");
		}else {
			System.out.println("Ad�n�z�n uzunlu�u soyad�n�z�n uzunlu�una e�it.");
		}
	}

}
