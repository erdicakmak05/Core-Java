package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý girinizz.");
		int sayi = scan.nextInt();
		
		if (sayi%2==1) {
			System.out.println("Girdiðniz sayý tektir");
		}
		if (sayi%2 == 0) {
			System.out.println("Girdiðiniz sayý çifttir.");
		}
		scan.close();
	}

}
