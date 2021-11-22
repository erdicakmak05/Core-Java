package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {

		/*
		 * Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu
		 * yazdirin Ornek: gun=Pazar output = �Hafta sonu� gun=Sali output = �Hafta ici�
		 *** String icin equals method�unu kullanin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("G�n ismi giriniz...");
		String gun = scan.next().toLowerCase();

		if (gun.equals("pazartesi") || gun.equals("sal�") || gun.equals("�ar�amba") || gun.equals("per�embe")
				|| gun.equals("cuma")) {
			System.out.println("Girdi�iniz g�n haftai�i");
		}
		if (gun.equals("cumartesi") || gun.equals("pazar")) {
			System.out.println("Girdi�iniz g�n haftasonu");
		}
		// String non-primitive oldu�u i�in == kullan�lamaz

	}

}
