package day03_Scanner;

import java.util.Scanner;

public class C06_Scanner {

	public static void main(String[] args) {
		
		// Scanner iþleminde String için 2 method vardýr
		// scan.next() dediðimizde sadece 1 kelime alýr 
		// eðer kullanýcýdan daha fazla kelime gelme ihtimali varsa 
		// scan.nextLine() kullanmamýz gerekir 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		
		String ad = scan.nextLine();
		
		System.out.println("Soyadýnýzý giriniz");
		
		String soyad = scan.nextLine();
		
		System.out.println("Girilen Ýsim : " + ad + " " + soyad);

	}

}
