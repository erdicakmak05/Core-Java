package day09_NestedIfElse;

import java.util.Scanner;

public class C04_Odev03 {

	public static void main(String[] args) {

		//Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam sayı giriniz...");
		int sayi1 = scan.nextInt();
		
		System.out.println("Girdiğiniz sayının mutlak değeri -> "+(sayi1<0 ? sayi1*-1 : sayi1));
	}

}
