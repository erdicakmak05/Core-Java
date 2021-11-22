package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q3 {

	public static void main(String[] args) {

		/*Kullanicidan isim isteyin. Eger

		- isim �a� harfi iceriyorsa �Girdiginiz isim a harfi iceriyor�
		- isim �Z� harfi iceriyorsa �Girdiginiz isim Z harfi iceriyor�
		- ikisi de yoksa �Girdiginiz isim a veya Z harfi icermiyor� yazdirin */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ad�n�z� giriniz...");
		String isim = scan.next();
		
		
		if (isim.contains("a")) {
			System.out.println("�sminiz 'a' harfi i�eriyor");
		} else if (isim.contains("Z")) {
			System.out.println("�sminiz 'Z' harfi i�eriyor");
		} else {
			System.out.println("�sminiz 'a' yada 'Z' harfi i�ermiyor.");
		}
	}

}
