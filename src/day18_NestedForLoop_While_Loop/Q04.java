package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
		// harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
		// yapmadigini farz edin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Başlangıc harfinin giriniz");
		char harf1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz.");
		char harf2 = scan.next().toUpperCase().charAt(0);
		
		
		
		while (harf1<=harf2) {
			System.out.print(harf1+" ");
			harf1++;
			
		}
		
		scan.close();
	}

}
