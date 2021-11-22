package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		String sayininStringDegeri = sayi +"";
		
		
		int i = 0;
		int toplam = 0;
		
		while (i<sayininStringDegeri.length()) {
			toplam+=Integer.valueOf(sayininStringDegeri.charAt(i))-'0';
			i++;
		}
		System.out.println("Rakamlar Toplami = "+toplam);
		scan.close();
	}

}
