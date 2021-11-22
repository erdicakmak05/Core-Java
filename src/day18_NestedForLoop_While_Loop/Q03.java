package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// Soru 3 ) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
		//			dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("Basşlangıc sayıysını giriniz.");
		int sayi1 = scan.nextInt();
		System.out.println("Bitiş sayısını giriniz");
		int sayi2 = scan.nextInt();
		
		int i = 0;
		while (sayi1<=sayi2) {
			if (sayi1%2==0) {
				System.out.println(sayi1+" ");
				sayi1+=2;
			}
			
		}
		scan.close();
	}

}
