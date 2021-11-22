package day12;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {

		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		 * kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin 
		 * 
		 * - Girilen kelime cumlede kullanilmamis. 
		 * - Girilen kelime cumlede 1 kere mi kullanilmis. 
		 * - Girilen kelime cumlede 1�den fazla kullanilmis.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir c�mle giriniz.");
		String cumle = scan.nextLine();
		System.out.println("Bir kelime giriniz.");
		String kelime = scan.next();
		
		int ilkIndex = cumle.indexOf(kelime);
		int sonIndex = cumle.lastIndexOf(kelime);
		
		if (ilkIndex==-1) {
			System.out.println("Girilen kelime c�mleden kullan�lmam��");
		} else if (ilkIndex==sonIndex) {
			System.out.println("Girilen kelime bir defa kullan�lm��t�r");
		} else {
			System.out.println("Girilen kelime birden �ok kez kullan�lm��t�r");
		}
	}

}
