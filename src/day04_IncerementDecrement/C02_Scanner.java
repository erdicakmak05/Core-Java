package day04_IncerementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý Giriniz...");
		
		char ad = scan.next().charAt(0);
		
		System.out.println("Ýsminizin baþ harfi : " + ad);
	}

}
