package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q5 {

	public static void main(String[] args) {

		//Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý giriniz");
		String ad = scan.next();
		
		System.out.println("Soyadýnýzý giriniz");
		String soyad = scan.next();
		
		if (ad.length()>soyad.length()) {
			System.out.println("Adýnýz soyadýnýzdan uzun");
		} else if (soyad.length()>ad.length()) {
			System.out.println("Soyadýnýz adýnýzdan uzun");
		}else {
			System.out.println("Adýnýzýn uzunluðu soyadýnýzýn uzunluðuna eþit.");
		}
	}

}
