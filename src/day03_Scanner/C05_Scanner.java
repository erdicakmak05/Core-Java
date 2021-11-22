package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		//Kullanicidan isim ve soyismini ayrý ayrý isteyip girilen ismi
		//aþaðýdaki gibi yazdýrýnýz.
		// Girilen Ýsim : Mehmet Bulut 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz");
		
		String ad = scan.next();
		
		System.out.println("Soyadýnýzý giriniz");
		
		String soyad = scan.next();
		
		System.out.println("Girilen Ýsim : " + ad + " " + soyad);
		
	}

}
