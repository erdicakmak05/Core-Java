package day12;

import java.util.Scanner;

public class C06_Contains {

	public static void main(String[] args) {

		/*
		 * Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com
		 * icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa “Email
		 * adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Email adresinizi giriniz");
		String mail = scan.next();
		//erdi@gmail.com.tr
		if (!mail.contains("@gmail.com")) {
			System.out.println("Lütfen gmail adresi giriniz");
		}  else if (mail.lastIndexOf("@gmail.com")==mail.length()-10) {
			System.out.println("Email adresiniz kaydedildi");
		}
		
		else {
			System.out.println("Mail adresinizi kontrol ediniz.");
		}

	}

}
