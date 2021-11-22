package day14_MethodCreation;

import java.util.Scanner;

public class Q_02_Farklı_Cozum {

	public static void main(String[] args) {

		// Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini
		// girerse,
		// kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
		// Kullanici
		// toplamak istedigi sayi adedini 4�den buyuk girerse �Cok sayi girdiniz, ben
		// toplayamam� yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Ka� say� toplamak istiyorsunuz");
		int toplanacakSayiSayisi = scan.nextInt();

		if (toplanacakSayiSayisi > 1 && toplanacakSayiSayisi <= 4) {

			if (toplanacakSayiSayisi == 2) {
				System.out.println("Toplammak istedi�iniz "+ toplanacakSayiSayisi+" tane say�y� giriniz.");
				int sayi1= scan.nextInt();
				int sayi2= scan.nextInt();
				
				ikiSayiyiTopla(sayi1,sayi2);

			} else if (toplanacakSayiSayisi == 3) {
				System.out.println("Toplammak istedi�iniz "+ toplanacakSayiSayisi+" tane say�y� giriniz.");
				int sayi1= scan.nextInt();
				int sayi2= scan.nextInt();
				int sayi3= scan.nextInt();
			
				ucSayiyiTopla(sayi1,sayi2,sayi3);

			} else if (toplanacakSayiSayisi == 4) {
				System.out.println("Toplammak istedi�iniz "+ toplanacakSayiSayisi+" tane say�y� giriniz.");
				int sayi1= scan.nextInt();
				int sayi2= scan.nextInt();
				int sayi3= scan.nextInt();
				int sayi4= scan.nextInt();
			
				dortSayiyiTopla(sayi1,sayi2,sayi3,sayi4);

			}

		} else {
			System.out.println("�ok say� girdiniz, toplayamam.");
		}
	}

	public static void dortSayiyiTopla(int sayi1, int sayi2, int sayi3, int sayi4) {

		System.out.println("D�rt say�n�n toplam� =" + (sayi1+sayi2+sayi3+sayi4));	
	}

	public static void ucSayiyiTopla(int sayi1, int sayi2, int sayi3) {

		System.out.println("�� say�n�n toplam� =" + (sayi1+sayi2+sayi3));	
	}

	public static void ikiSayiyiTopla(int sayi1,int sayi2) {
		
		System.out.println("�ki say�n�n toplam� =" + (sayi1+sayi2));	
	}

}
