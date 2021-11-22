package day16_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		//Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar
		// 3’un veya 5”in kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Yüzden küçük sayı giriniz");
		int sayi = scan.nextInt();
		
		for (int i = 0; i < sayi; i++) {
			
			if(i%3==0 ||i%5==0) {
				System.out.println(i);
			}
			
		}
	}

}
