package day03_Scanner;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		// Kullan�c�dan ilk �nce kullan�c� ad�n� girmesini isteyin, daha sonra �ifresini girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci say�");
		
		int sayi1 = scan.nextInt();
		
		System.out.println("�kinci sayi");
		
		int sayi2 = scan.nextInt();

		
		
		if (sayi1>sayi2) {
			System.out.println("1 say� 2. den b�y�k ");
		} else  {
			System.out.println("2. Sayi 1 den b�y�k ");
		}
		
		
	}

}
