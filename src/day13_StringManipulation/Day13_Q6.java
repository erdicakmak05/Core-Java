package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q6 {

	public static void main(String[] args) {

		/*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa �Sifre
		basari ile tanimlandi�, sartlari saglamazsa �Islem basarisiz,Lutfen yeni bir
		sifre girin� yazdirin
		- Ilk harf buyuk harf olmali
		- Son harf kucuk harf olmali
		- Sifre bosluk icermemeli
		- Sifre uzunlugu en az 8 karakter olmali*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kurallara uyan bir �ifre giriniz.");
		String sifre = scan.nextLine();
		
		
		if (!(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z')) {
			System.out.println("�ifreniz B�y�k Harf ile Ba�lam�yor.");
		} else if (!(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')) {
			System.out.println("�ifreniz K���k harf ile bitmeli");
		} else if (!(sifre.length()>=8)) {
			System.out.println("�ifreniz 8 Karakterden uzun olmal�");
		} else if (sifre.contains(" ")) {
			System.out.println("�ifreniz Bo�luk ��ermemeli");
		} else {
			System.out.println("�ifreniz ba�ar�yla kaydedildi");
		}
		
		
		
		/*if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' && sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z' && sifre.length()>=8 && !sifre.contains(" ")) {
			System.out.println("�ifreniz kaydedildi");
		} else {
			System.out.println("HATA");
		}*/
		
		
	}

}
