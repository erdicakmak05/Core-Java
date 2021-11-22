package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {

		// Kullanıcıdan 2 tam sayı isteyin 
		// ilk sayidan başlıyarak ikinci sayıya kadar 3 er 3 er yazdırın.
		// (ikinci sayi dahil olmak zorunda değil
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir int sayı giriniz.");
		int sayi1 =  scan.nextInt();
		System.out.println("Bir int sayı giriniz.");
		int sayi2 =  scan.nextInt();
		
		
		if (sayi1<sayi2) {
			for (int i = sayi1; i <= sayi2; i+=3) {
				System.out.println(i);
			}
		} else if (sayi2<sayi1) {
			for (int i = sayi2; i <= sayi1; i+=3) {
				System.out.println(i);
			}
		} else {
			System.out.println("Girilen sayılar eşit");
		}
		
		
		scan.close();
	}

}
