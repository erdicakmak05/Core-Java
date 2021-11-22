package day12;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {

		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
		// olmadigini yazdirin
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir c�mle giriniz.");
		String cumle = scan.nextLine();
		System.out.println("Bir karakter giriniz.");
		char krk = scan.next().charAt(0);
		
		int index = cumle.lastIndexOf(krk);
		
		if (index>0) {
			System.out.println("Arad���n�z harf c�mlede mevcut");
		}else if (index==-1) {
			System.out.println("Arad���n�z harf c�mlede kullan�lmam��");
		}
		scan.close();
	}

}
