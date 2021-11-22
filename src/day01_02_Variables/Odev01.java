package day01_02_Variables;

public class Odev01 {
	
		/*
		1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		2- isim ve soyisim icin iki variable olusturun ve bunlari

			isminiz : Mehmet
			soyisminiz : Bulutluoz
			seklinde yazdirin

		3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
		4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
		5 – char data turunde bir variable olusturun ve yazdirin
		6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		 */
	
	public static void main(String[] args) {
		
		String ad = "Mahmut";
		int yas = 19;
		char cinsiyet = 'E';
		
		
		System.out.println(ad);
		System.out.println(yas);
		System.out.println(cinsiyet);
		
		String isim = "Mehmet";
		String soyIsim = "Bulut";
		
		System.out.println("Ýsminiz : "+isim);
		System.out.println("Soyisminiz : "+soyIsim);
		
		int sayi1 = 25;
		int sayi2 = 63;
		
		System.out.println(sayi1+sayi2);
		
		int sayi3 = 55;
		float sayi4 = 6.52f;
		
		System.out.println(sayi3+sayi4);
		
		char harf = 'L';
		System.out.println(harf);
		
		//6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
		
		int sayi5 = 11;
		
		System.out.println(harf+sayi5);
		
		// Primitive Data Türleri 
		
		boolean dogruMu = true;
		
		char numara2 = '6';
		
		byte numara3 = 127;
		
		short numara4 = 5689;
		
		int numara1 = 5;
		
		long numara5 = 565852522656L;
		
		float numara6 = 29.876F;
		
		double numara7 = 65.7;
		
		// Primitive olmayan String...
		
		
		
	}

}
