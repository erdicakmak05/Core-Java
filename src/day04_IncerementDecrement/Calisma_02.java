package day04_IncerementDecrement;

import java.util.Scanner;

public class Calisma_02 {

	public static void main(String[] args) {

		// Hesap makinas�nda 4 i�lem yapabiliriz.
		// Toplama(+) ��kartma(-) B�lme (/) �arpma(*)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Yapmak istedi�iniz i�lmemi se�iniz... \n1:Toplama\n2:��kartma\n3:B�lme\n4:�arpma");
		
		int intSecenek = scan.nextInt();
		
		
		System.out.println("Birinci say�y� giriniz...");
		int sayi1 = scan.nextInt();
		System.out.println("�kinci sayiyi giriniz....");
		int sayi2 = scan.nextInt();
		
		switch (intSecenek) {
			case 1:
				int toplam = sayi1+sayi2;
				System.out.println("Sonu� : " + toplam);
				break;
			case 2:
				int cikarma = sayi1-sayi2;
				System.out.println("Sonu� : " + cikarma);
				break;
			case 3:
				int bolme = sayi1/sayi2;
				System.out.println("Sonu� : " + bolme);
				break;
			case 4:
				int carpma = sayi1*sayi2;
				System.out.println("Sonu� : " + carpma);
				break;
				
			default : 
				System.out.println("Ge�erli bir i�lem giriniz.");
							
				
		}
		
	}

}
