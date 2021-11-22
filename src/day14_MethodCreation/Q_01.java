package day14_MethodCreation;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		// Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
		// kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
		// rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
		// olusturun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz.");
		int sayi = scan.nextInt();
		
		tekCift(sayi);
		sifirdanBuyukmu(sayi);
		yuzdenBuyukKucuk(sayi);
		
		scan.close();
		
		
	}

	public static void yuzdenBuyukKucuk(int sayi) {

		if (sayi>100) {
			
		System.out.println("100 den büyük sayýnýn rakamlarý toplamý = " + (sayi%10 +(sayi/10)%10 +(sayi/100)%10));	
		} else {
			System.out.println("100 den küçük sayýnýn birler basamaðý = " + (sayi%10));
		}
	}

	public static void sifirdanBuyukmu(int sayi) {

		if (sayi >0) {
			System.out.println("Sayý 0'dan büyüktür.");
		}else {
			System.out.println("Sayý 0'dan küçüktür.");
		}
	}

	public static void tekCift(int sayi) {

		if (sayi%2==0) {
			System.out.println("Sayý Çifttir.");
		} else {
			System.out.println("Sayý Tektir.");
		}
	}

}
