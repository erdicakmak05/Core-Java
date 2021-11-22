package day14_MethodCreation;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		// Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
		// kucuk mu oldugunu, ayrica ve 100�den buyukse birler,onlar ve yuzler basamagindaki
		// rakamlarin toplamini,100�den kucukse sadece 1�ler basamagini yazdiran 3 method
		// olusturun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz.");
		int sayi = scan.nextInt();
		
		tekCift(sayi);
		sifirdanBuyukmu(sayi);
		yuzdenBuyukKucuk(sayi);
		
		scan.close();
		
		
	}

	public static void yuzdenBuyukKucuk(int sayi) {

		if (sayi>100) {
			
		System.out.println("100 den b�y�k say�n�n rakamlar� toplam� = " + (sayi%10 +(sayi/10)%10 +(sayi/100)%10));	
		} else {
			System.out.println("100 den k���k say�n�n birler basama�� = " + (sayi%10));
		}
	}

	public static void sifirdanBuyukmu(int sayi) {

		if (sayi >0) {
			System.out.println("Say� 0'dan b�y�kt�r.");
		}else {
			System.out.println("Say� 0'dan k���kt�r.");
		}
	}

	public static void tekCift(int sayi) {

		if (sayi%2==0) {
			System.out.println("Say� �ifttir.");
		} else {
			System.out.println("Say� Tektir.");
		}
	}

}
