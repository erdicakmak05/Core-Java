package day40;

import java.util.Scanner;

public class C03_Exeption {

	public static void main(String[] args) {

		// Verilen bir int array için kullanıcadan sayi isteyin ve girilean sayiyi
		// indeks olarak kabul edip o indeksdeki elementi yazdırın.

		int arr[] = { 2, 3, 5, 6, 2, 7, 9, 1 };
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int index = scan.nextInt();
		
		System.out.println("Girdiğiniz indexdeki eleman : "+arr[index]);
	}
}
