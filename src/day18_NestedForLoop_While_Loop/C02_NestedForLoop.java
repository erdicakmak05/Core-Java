package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class C02_NestedForLoop {

	public static void main(String[] args) {

		// Kullanicidan 10 dan küçük pozitif bir tam sayi girmesini isteyin.
		// girdiği sayiya göre aşağıdkai şekli yazdırın
		// Orn: 3
		// 1
		// 1 2
		// 1 2 3

		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan küçük bir sayı giriniz.");
		int sayi1 = scan.nextInt();

		if (sayi1 < 10) {

			for (int satir = 1; satir <= sayi1; satir++) {

				for (int i = 1; i <= satir; i++) {
					System.out.print(i + " ");
				}

				System.out.println(" ");
			}

		} else {
			System.out.println("Hata, yanlış dğer girdiniz.");
		}
		scan.close();

	}

}
