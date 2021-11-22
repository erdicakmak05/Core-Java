package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		// Scanner i�leminde String i�in 2 method vard�r
		// scan.next() dedi�imizde sadece 1 kelime al�r 
		// e�er kullan�c�dan daha fazla kelime gelme ihtimali varsa 
		// scan.nextLine() kullanmam�z gerekir 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz");
		
		String ad = scan.nextLine();
		
		System.out.println("Soyad�n�z� giriniz");
		
		String soyad = scan.nextLine();
		
		System.out.println("Girilen �sim : " + ad + " " + soyad);

	}

}
