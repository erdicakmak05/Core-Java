package day09_NestedIfElse;

import java.util.Scanner;

public class C04_Odev01 {

	public static void main(String[] args) {

		//Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz...");
		int sayi1 = scan.nextInt();
		System.out.println("�kinci sayiyi giriniz");
		int sayi2 = scan.nextInt();
		
		int kucukSayi = (sayi1<sayi2) ? sayi1 : sayi2;
		
		System.out.println("K���k olan say� --> "+kucukSayi);
		

	}

}
