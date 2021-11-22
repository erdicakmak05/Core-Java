package day17_ForLoops;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		
		//Soru 9 ) Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String’in
		//         palindrome olup olmadigini kontrol eden bir program yazin.

		Scanner scan = new Scanner (System.in);
		System.out.println("Bir kelime giriniz.");
		String str1 = scan.next();
		
		if (str1.equals(tersineCevir(str1))) {
			System.out.println("Girdiğiniz string palidrom");
		} else {
			System.out.println("Girdiğiniz string palidrom değil.");
		}
		
		
	}
	
	private static String tersineCevir(String str1) {
		
		String tersStr1 ="";
		
		for (int i = str1.length()-1; i >= 0; i--) {
			
			tersStr1+=str1.substring(i, i+1);
		}
		
		return tersStr1;
	}

}
