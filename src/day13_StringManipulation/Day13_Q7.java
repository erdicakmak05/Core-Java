package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q7 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki
		 * gibi yazdirin
		 * 
		 * isim-soyisim : M***** B******* kart no : **** **** **** 1234
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý  giriniz");
		String ad = scan.next();
		
		System.out.println("Soyadýnýzý giriniz");
		String soyad = scan.next();
		
		System.out.println("Kredi Kartý bilginizi giriniz.");
		String kKarti = scan.next();
		
		ad = ad.substring(0,1).toUpperCase()+ ad.substring(1).replaceAll("\\w", "*");
		
		soyad = soyad.substring(0, 1).toUpperCase()+soyad.substring(1).replaceAll("\\w", "*");
		
		System.out.println("isim-soyisim : "+  ad + " " + soyad);
		
		String kkFormati = "**** **** **** "+kKarti.substring(12);
		System.out.println(kkFormati);

	}

}
