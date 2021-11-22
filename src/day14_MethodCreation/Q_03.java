package day14_MethodCreation;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {

		/*Email kontrolu yapan bir program yazin.Kullanicinin girdigi mail
		-
		-@ isareti icermiyorsa gecersiz email yazdirin
		-
		-@gmail.com icermiyorsa �lutfen gmail adresinizi girin� yazdirin
		-
		-@gmail.com ile bitmiyorsa �Yazimda bir sorun var, maili kontrol*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("E-mail adresinizi giriniz.");
		String email = scan.next();
		
		etVarmi(email);
		
		mailDogruBitiyorMu(email);
		
		dogruBitiyorMu(email);
		
		

	}

	public static void dogruBitiyorMu(String email) {

		if (email.endsWith("@gmail.com")) {
			System.out.println("Ba�ar�l�");
		} else {
			System.out.println("Mail adresiniz @gmail.com ile bitmiyor.Hata");
		}
	}

	public static void mailDogruBitiyorMu(String email) {

		if (!email.contains("@gmail.com")) {
			System.out.println("Mail adresiniz @gmail.com ile i�ermiyor.Hata");
		}
	}

	public static void etVarmi(String email) {

		if (!email.contains("@")) {
			System.out.println("Ge�ersiz email.");
		} 
	}

}
