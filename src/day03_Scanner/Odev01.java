package day03_Scanner;

import java.util.Scanner;

public class Odev01 {
	
	public static void main(String[] args) {
		
		/*//Soru 1) Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci say�y� giriniz.");
		
		int birinciSayi = scan.nextInt();
		
		System.out.println("�kinci say�y� giriniz...");
		
		int ikinciSayi = scan.nextInt();
		
		System.out.println("Toplam...:"+ (birinciSayi+ ikinciSayi));
		
		System.out.println("Fark�..."+ (birinciSayi-ikinciSayi));
		
		System.out.println("�arp�m�..."+ (birinciSayi*ikinciSayi));
		
	//Soru 2) Kullanicidan karenin bir kenar uzunlu�unu alin ve karenin cevresini ve alanini
	//        hesaplayip yazdirin
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("Karenin kenar uzunlu�unu giriniz...");
		
		int kareninKenarUzunlugu = scan2.nextInt();
		
		System.out.println("Karenin �evre uzunlu�u : " + (kareninKenarUzunlugu*4));
		
		System.out.println("Karenin alan� : " + (kareninKenarUzunlugu*kareninKenarUzunlugu));
		
		
	//Soru 3:Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		
		
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("�emberin yar��ap�n� giriniz...");
		
		double yariCap= scan3.nextDouble();
		
		System.out.println("�emberin �evresi...."+ (yariCap*(2*3.14)));
		
		System.out.println("�emberin alan�....." + (3.14*yariCap*yariCap));*/
		
	// Soru 4:Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
	//    prizmanin hacmini hesaplayip yazdirin	
		
		Scanner scan4 = new Scanner(System.in);
		
		System.out.println("Uzun Kenar� giriniz...");
		
		int a = scan4.nextInt();
		
		System.out.println("K�sa Kenar� giriniz...");
		
		int b = scan4.nextInt();
		
		System.out.println("Y�ksek Kenar� giriniz...");
		
		int c = scan4.nextInt();
		
		int d = ((a*b)+(b*c)+(a*c));
		
		System.out.println("Prizman�n alan� : " + (2*(d*d)));
		
		//Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki
	    //        sekilde yazdirin
	    //        Isim � soyisim :YILMAZ TARHAN
		
		Scanner girdi = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz.");
		
		String ad = girdi.nextLine();
		
		System.out.println("Soyad�n�z� giriniz");
		
		String soyad = girdi.nextLine();
		
		System.out.println("Ad�n�z Soyad�n�z :" + ad + " " + soyad);
		
		girdi.close();
				
	}
}
