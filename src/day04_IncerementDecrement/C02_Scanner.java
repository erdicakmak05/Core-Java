package day04_IncerementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad�n�z� Giriniz...");
		
		char ad = scan.next().charAt(0);
		
		System.out.println("�sminizin ba� harfi : " + ad);
	}

}
