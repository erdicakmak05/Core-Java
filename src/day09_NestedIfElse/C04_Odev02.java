package day09_NestedIfElse;

import java.util.Scanner;

public class C04_Odev02 {

	public static void main(String[] args) {

		// Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu
		// yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tam say� giriniz...");
		int sayi1 = scan.nextInt();

		System.out.println(sayi1 % 2 == 0 ? "Girdi�iniz sayi --> �ift" : "Girdi�iniz sayi --> Tek");
	}

}
