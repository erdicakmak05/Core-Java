package day19_While_Loop_Do_While;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {

		/*
		 * Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam
		 * kac tane
		 * 
		 * olduklarini ekranda yazdirin
		 */
		Scanner scan = new Scanner (System.in);
		System.out.println("Lütfen bölenleri bulmak için pozitif bir tam sayi giriniz.");
		int sayi = scan.nextInt();
		
		int sayac = 0;
		int bolen = 1;
		
		while (bolen<=sayi) {
			
			if (sayi%bolen==0) {
				System.out.println(bolen + " ");
				sayac++;
			}
			bolen++;
		}
		System.out.println(sayi + " sayisinin " + +sayac + " adet tam böleni vardır");
		scan.close();
	}

}
