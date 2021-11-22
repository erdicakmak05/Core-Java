package day17_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		//	Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //	sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10'dan küçük bir sayı girin.");
		int sayi1 = scan.nextInt();
		int toplam = 1;
		
		System.out.print(sayi1 + "!=");
		for (int i = 1; i <= sayi1; i++) {
			
			toplam *= i;
			System.out.print(i+"*");
			
		}
		System.out.println(" Girdiğniz sayının faktöriyeli ==> " + toplam);
	}

}
