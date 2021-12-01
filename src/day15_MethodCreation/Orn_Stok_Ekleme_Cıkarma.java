package day15_MethodCreation;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Orn_Stok_Ekleme_Cıkarma {

	public static void main(String[] args) {

		/*
		 * Bir mağaza satici stokları güncelleme programı istiyor.
		 */

		String urun1 = "Patates";
		String urun2 = "Domates";
		String urun3 = "Soğan";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ürün sayınızı giriniz.");
		int urunSayisi = scan.nextInt();

		menuGoster();
		
		int tercih = scan.nextInt();
		
		/*if (tercih==1) {
			
			String urunler =  (String) urunEkle(urunSayisi);
			System.out.println("Eklenen ürün -->  " + urunler[0]);
		} else if (tercih==2) {
			guncelStokGor();
		} else if (tercih==3) {
			stokGuncelle();
		} 

		
		*/
		

	}

	private static void menuGoster() {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Manav Programına Hoşgeldiniz.");
		System.out.println("1- Ürün Ekle");
		System.out.println("2- Güncel Stok Durumununu Gör");
		System.out.println("3- Mevcut Ürünün Stoğunu Güncelle");
		

	}

	private static void stokGuncelle() {
		// TODO Auto-generated method stub
		
	}

	private static void guncelStokGor() {
		// TODO Auto-generated method stub
		
	}

	/*private static String urunEkle(int urunSayisi) {
		//urunSayisi++;
		for(int i =0 ; i<urunSayisi.length;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Eklemek istediğiniz ürünün ismini giriniz.");
			urunSayisi[i] = scanner.nextLine();
		}
		
		return  urunSayisi[urunSayisi];
	}

*/

}
