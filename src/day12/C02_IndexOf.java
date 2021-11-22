package day12;

import java.util.Scanner;

public class C02_IndexOf {

	public static void main(String[] args) {

		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		 * kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin 
		 * 
		 * - Girilen kelime cumlede kullanilmamis. 
		 * - Girilen kelime cumlede 1 kere mi kullanilmis. 
		 * - Girilen kelime cumlede 1’den fazla kullanilmis.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir cümle giriniz.");
		String cumle = scan.nextLine();
		System.out.println("Bir karakter giriniz.");
		String kelime = scan.next();
		
		int index = cumle.indexOf(kelime);
		/*
		 * else if(cumle.indexOf(kelime, index+1)<0) // bu kýsým cumle.indexOf("ali",11) 11 den sonra ali var mý bak demek 
		 * 
		 * yoksa deðer -1 olur yani 0 dan küçük
		 */
		
		if (index<0) {
			System.out.println("Girilen kelime cumlede KULLANILMAMIÞ");
		} else if(cumle.indexOf(kelime, index+1)<0) {
			System.out.println("Girilen kelime cumlede bir kere kullanýlmýþ");
		}else {
			System.out.println("Girilen kelime birden fazla kullanýlmýþ");
		}
	}

}
