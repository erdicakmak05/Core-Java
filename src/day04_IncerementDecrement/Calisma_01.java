package day04_IncerementDecrement;

import java.util.Scanner;

public class Calisma_01 {

	public static void main(String[] args) {

		// Kulan�cadan bir tam say� bir de ondal�k say� girmesini isteyelim.
		// 
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir tam sayi giriniz....");
		
		int sayi1 = scan.nextInt();
		
		System.out.println("Bir ondal�k say� giriniz...");
		
		double sayi2 = scan.nextDouble();
		*/
		
		/*int sayi1 = 10;
		
		double sayi2 = sayi1;
		
		double sayi3 = 65.5;
		
		int sayi4 = (int) sayi3;
		
		System.out.println(sayi4);
		
		System.out.println(sayi3);
		*/
		//Soru1: 
		//Klavyeden girilen 3 say�n�n ortalamas�n� alan bir uygulama yaz�n�z
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci say�y� giriniz.");
		
		double birinciSayi = scan.nextDouble();
		
		System.out.println("�kinci say�y� giriniz.");
		
		double ikinciSayi = scan.nextDouble();
		
		System.out.println("���nc� say�y� giriniz.");
		
		double ucuncuSayi = scan.nextDouble();
		
		double ortalama = (birinciSayi+ikinciSayi+ucuncuSayi)/3;
		
		System.out.println("Ortalama : "+ortalama);*/
		
		//Kullan�c�dan ald���n�z de�erlere g�re v�cut kitle endeksini hesaplay�n�z.
		//V�cut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)
		
		/*Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Kilonuzu giriniz.");
		
		double kilo = scan1.nextDouble();
		
		System.out.println("Boyunuzu giriniz...");
		
		double boy = scan1.nextDouble();
		
		double vke = kilo/((boy/100)*(boy/100));
		
		
		System.out.println("V�cut Kitle indexiniz : " + vke);
		*/
		
		//double 255.36 sayisini int�a ve sonra da olusturdugunuz int sayiyi byte�a cevirip

		//yazdirin
		
		/*double sayi7 = 255.36;
		
		int sayi8 = (int) sayi7;
		
		byte sayi9 = (byte) sayi8;
		
		System.out.println(sayi9);
		*/
		
		int sayi1 = 10;
		
		sayi1++;
		
		sayi1--;
		
		sayi1 = sayi1*5;
		
		sayi1 += 5;
		sayi1 *= 5;   //sayi1 = sayi1 * 5 
		
		//------------------------------------------------------------
		
		int a = 15;
		
		int b = ++a;
		
		System.out.println(b);
		
		
		String yazi = "Ahmet";
		
		System.out.println(yazi.charAt(0));
		
		
	}

}
