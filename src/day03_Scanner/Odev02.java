package day03_Scanner;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {

		// Kullanýcýdan ilk önce kullanýcý adýný girmesini isteyin, daha sonra þifresini girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayý");
		
		int sayi1 = scan.nextInt();
		
		System.out.println("Ýkinci sayi");
		
		int sayi2 = scan.nextInt();

		
		
		if (sayi1>sayi2) {
			System.out.println("1 sayý 2. den büyük ");
		} else  {
			System.out.println("2. Sayi 1 den büyük ");
		}
		
		
	}

}
