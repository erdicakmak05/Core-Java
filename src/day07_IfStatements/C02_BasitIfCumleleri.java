package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� girinizz.");
		int sayi = scan.nextInt();
		
		if (sayi%2==1) {
			System.out.println("Girdi�niz say� tektir");
		}
		if (sayi%2 == 0) {
			System.out.println("Girdi�iniz say� �ifttir.");
		}
		scan.close();
	}

}
