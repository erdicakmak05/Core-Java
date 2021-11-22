package day04_IncerementDecrement;

import java.util.Scanner;

public class Calisma_02 {

	public static void main(String[] args) {

		// Hesap makinasýnda 4 iþlem yapabiliriz.
		// Toplama(+) Çýkartma(-) Bölme (/) Çarpma(*)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yapmak istediðiniz iþlmemi seçiniz... \n1:Toplama\n2:Çýkartma\n3:Bölme\n4:Çarpma");
		
		int intSecenek = scan.nextInt();
		
		
		System.out.println("Birinci sayýyý giriniz...");
		int sayi1 = scan.nextInt();
		System.out.println("Ýkinci sayiyi giriniz....");
		int sayi2 = scan.nextInt();
		
		switch (intSecenek) {
			case 1:
				int toplam = sayi1+sayi2;
				System.out.println("Sonuç : " + toplam);
				break;
			case 2:
				int cikarma = sayi1-sayi2;
				System.out.println("Sonuç : " + cikarma);
				break;
			case 3:
				int bolme = sayi1/sayi2;
				System.out.println("Sonuç : " + bolme);
				break;
			case 4:
				int carpma = sayi1*sayi2;
				System.out.println("Sonuç : " + carpma);
				break;
				
			default : 
				System.out.println("Geçerli bir iþlem giriniz.");
							
				
		}
		
	}

}
