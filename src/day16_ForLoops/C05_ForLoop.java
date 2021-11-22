package day16_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {

		// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar

		// 3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("100 den küçük bir sayı giriniz.");
		
		double sayi = scan.nextDouble();
		
		int num = (int) sayi ;
		// Kullanıcı Tam sayı girmeyebilir bunu konrolünü yeni bir değer oluşturup narrowing yaparak çözebiliriz.
		// num sayi değerine eşit değilse , kullanıcının double değer girmiş olduğunu anlarız.
		
		if (sayi<0 ) {
			System.out.println("Negatif sayı giremezsiniz");
		} else if (num!=sayi) {
			System.out.println("Lütfen tam sayi giriniz.");
		} else if (sayi>100) {
			System.out.println("Lütfen yüzden küçük sayı girin.");
		} else {
				for (int i = 1; i < sayi; i++) {
					if(i%3==0) {
						System.out.print(i + " ");
					}
				}
			}
		
		
		

	}

}
