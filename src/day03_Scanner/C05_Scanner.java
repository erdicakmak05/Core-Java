package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		//Kullanicidan isim ve soyismini ayr� ayr� isteyip girilen ismi
		//a�a��daki gibi yazd�r�n�z.
		// Girilen �sim : Mehmet Bulut 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz");
		
		String ad = scan.next();
		
		System.out.println("Soyad�n�z� giriniz");
		
		String soyad = scan.next();
		
		System.out.println("Girilen �sim : " + ad + " " + soyad);
		
	}

}
