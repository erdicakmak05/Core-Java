package day03_Scanner;

import java.util.Scanner;

public class Odev01 {
	
	public static void main(String[] args) {
		
		/*//Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayýyý giriniz.");
		
		int birinciSayi = scan.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz...");
		
		int ikinciSayi = scan.nextInt();
		
		System.out.println("Toplam...:"+ (birinciSayi+ ikinciSayi));
		
		System.out.println("Farký..."+ (birinciSayi-ikinciSayi));
		
		System.out.println("Çarpýmý..."+ (birinciSayi*ikinciSayi));
		
	//Soru 2) Kullanicidan karenin bir kenar uzunluðunu alin ve karenin cevresini ve alanini
	//        hesaplayip yazdirin
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunluðunu giriniz...");
		
		int kareninKenarUzunlugu = scan2.nextInt();
		
		System.out.println("Karenin çevre uzunluðu : " + (kareninKenarUzunlugu*4));
		
		System.out.println("Karenin alaný : " + (kareninKenarUzunlugu*kareninKenarUzunlugu));
		
		
	//Soru 3:Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("Çemberin yarýçapýný giriniz...");
		
		double yariCap= scan3.nextDouble();
		
		System.out.println("Çemberin çevresi...."+ (yariCap*(2*3.14)));
		
		System.out.println("Çemberin alaný....." + (3.14*yariCap*yariCap));*/
		
	// Soru 4:Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
	//    prizmanin hacmini hesaplayip yazdirin	
		
		Scanner scan4 = new Scanner(System.in);
		
		System.out.println("Uzun Kenarý giriniz...");
		
		int a = scan4.nextInt();
		
		System.out.println("Kýsa Kenarý giriniz...");
		
		int b = scan4.nextInt();
		
		System.out.println("Yüksek Kenarý giriniz...");
		
		int c = scan4.nextInt();
		
		int d = ((a*b)+(b*c)+(a*c));
		
		System.out.println("Prizmanýn alaný : " + (2*(d*d)));
		
		//Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
	    //        sekilde yazdirin
	    //        Isim – soyisim :YILMAZ TARHAN
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz.");
		
		String ad = girdi.nextLine();
		
		System.out.println("Soyadýnýzý giriniz");
		
		String soyad = girdi.nextLine();
		
		System.out.println("Adýnýz Soyadýnýz :" + ad + " " + soyad);
		
		girdi.close();
				
	}
}
