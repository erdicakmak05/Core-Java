package day17_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {

		//Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir kelime giriniz.");
		String str1 = scan.next();
		// erdi
		// length 4 
		// 
		for (int i = 0; i <= str1.length()-1; i++) {
			System.out.print(str1.charAt((str1.length()-1)-i));			
		}
		
		scan.close();
		
	}

}
