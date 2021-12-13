package day40;

import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// kullanicidan istediği kadar sayi alıp
		// bu sayilari toplayan bir program yaziniz.
		// sayi girişini bitirmek içi q ya basınız
		
		int sayi = 0;
		
		int toplam = 0;
		int count=0;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(count<10000) {
			System.out.println("Lütfen toplamak için bir sayi yaziniz.\nBitirmek için Q'ya basınız.");
			sayi = scan.nextInt();
			toplam+=sayi;
			count++;
		}
		System.out.println("Sayilarin toplami : " + toplam);
	}

}
