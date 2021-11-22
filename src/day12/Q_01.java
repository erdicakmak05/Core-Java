package day12;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		/*
		 * Soru 1) Kullanicidan email adresini girmesini isteyin,++
		 * mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”,++
		 * @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
		 * @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		 */
		
		// Kullanicidan email adresini girmesini isteyin
		Scanner scan = new Scanner(System.in);
		System.out.println("Mail adresinizi giriniz");
		String mail = scan.next();
		
		int mailIndexOf = mail.indexOf("@gmail.com",11);
		int mailLastIndexOf = mail.lastIndexOf("@gmail.com");
		
		System.out.println(mail.indexOf("@gmail.com"));
		
		if (!mail.contains("@gmail.com")) {
			System.out.println("gmail adresinizi giriniz.");
		}else if (mail.lastIndexOf("@gmail.com")==mail.length()-10){
			System.out.println("Email adresiniz kaydedildi.");
		}else {
			System.out.println("Lütfen gmail adresinizi giriniz.");

		}
		
		
		}

	}

