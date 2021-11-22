package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q3 {

	public static void main(String[] args) {

		/*Kullanicidan isim isteyin. Eger

		- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Adýnýzý giriniz...");
		String isim = scan.next();
		
		
		if (isim.contains("a")) {
			System.out.println("Ýsminiz 'a' harfi içeriyor");
		} else if (isim.contains("Z")) {
			System.out.println("Ýsminiz 'Z' harfi içeriyor");
		} else {
			System.out.println("Ýsminiz 'a' yada 'Z' harfi içermiyor.");
		}
	}

}
