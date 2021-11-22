package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		
		//	Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane

		//	olduklarini ekranda yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scan.nextInt();
		
		
		int i = 1;
		int sayac = 0;
		
		while (i<=sayi) {
			
			if (sayi%i==0) {
				System.out.println(i+" ");
				sayac++;
			}
			i++;
		}
		
		System.out.println(sayi+" sayisinin "+sayac+" tam böleni vardır");
		scan.close();
	}

}
