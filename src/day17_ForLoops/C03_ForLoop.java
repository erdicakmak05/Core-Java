package day17_ForLoops;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {

		//Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersine ceviren bir program yazin.

		Scanner scan = new Scanner (System.in);
		System.out.println("Bir kelime giriniz.");
		String str1 = scan.next();
		
		System.out.println(tersineCevir(str1));
		
		scan.close();
	}

	private static String tersineCevir(String str1) {
		
		String tersStr1 ="";
		
		for (int i = str1.length()-1; i >= 0; i--) {
			
			tersStr1+=str1.substring(i, i+1);
		}
		
		return tersStr1;

		
	}

}
