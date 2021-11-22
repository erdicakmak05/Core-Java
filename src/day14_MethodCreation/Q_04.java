package day14_MethodCreation;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {

		/*Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
	numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
	sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
	duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
	geri dondurun.*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("�sminizi giriniz");
		String ad = scan.next();
		System.out.println("Soyad�n�z� giriniz.");
		String soyad = scan.next();
		System.out.println("Kredi kart� numaran�z� bo�luk kullanmadan giriniz");
		String kKartNumarasi = scan.next();
		
		adSoyadDuzenle(ad, soyad);
		kKDuzenle(kKartNumarasi);
		
		
		
		
		
	}

	public static void kKDuzenle(String kKartNumarasi) {
		if (kKartNumarasi.length()==16) {
	System.out.println(	"K.Kart� No : "+kKartNumarasi.substring(0,4)+" "+kKartNumarasi.substring(4,8)+" "+kKartNumarasi.substring(8,12)+" "+kKartNumarasi.substring(12,16));
		}else {
			System.out.println("Kredi Kart� numaran�z� kontrol edin");
		}
		
	}

	public static void adSoyadDuzenle(String ad, String soyad) {

		System.out.println("Ad�n�z Soyad�n�z : "+ad.toUpperCase().charAt(0)+ad.substring(1) +" " + soyad.toUpperCase().charAt(0)+soyad.substring(1));
	}

}
