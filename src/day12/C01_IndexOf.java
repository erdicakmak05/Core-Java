package day12;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {

		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
		// olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir cümle giriniz.");
		String cumle = scan.nextLine();
		System.out.println("Bir karakter giriniz.");
		char krk = scan.next().charAt(0);
		
		if (cumle.indexOf(krk)>0)
			System.out.println("Harf var");
		else
			System.out.println("Harf yok");
		
	}

}
