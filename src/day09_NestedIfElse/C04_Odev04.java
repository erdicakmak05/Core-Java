package day09_NestedIfElse;

import java.util.Scanner;

public class C04_Odev04 {

	public static void main(String[] args) {

		/*
		 * Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse �Sayi pozitif� yazdirin,
		 * negatifse sayinin karesini yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz...");
		int sayi1 = scan.nextInt();
		
		System.out.println(sayi1>0 ? "Say� Pozitif" : sayi1*sayi1);
	}

}
