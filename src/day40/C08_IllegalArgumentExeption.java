package day40;

import java.util.Scanner;

public class C08_IllegalArgumentExeption {

	public static void main(String[] args) {
		// Kullanicidan yaşını girmesini isteyin.
		// kullanıcıda sifirdan kucuk bir sayi girerse Exewptiın verdirin.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen konsolda görmek için yaşınızı giriniz.");
		
		int yas = scan.nextInt();
		
		try {
			if(yas<0) {
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("Yas 0 dan kucuk olamaz");
		}

	}

}
