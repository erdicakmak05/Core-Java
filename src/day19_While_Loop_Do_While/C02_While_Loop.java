package day19_While_Loop_Do_While;

import java.util.Scanner;

public class C02_While_Loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scan.nextInt();

		String sayininStringDegeri = sayi + "";

		int i = 0;
		int toplam = 0;
	
		
		while (i < sayininStringDegeri.length()) {
			toplam += Integer.valueOf(sayininStringDegeri.charAt(i)) - '0';
			i++;
		}
		System.out.println("Rakamlar Toplami = " + toplam);
		scan.close();
	}

}
