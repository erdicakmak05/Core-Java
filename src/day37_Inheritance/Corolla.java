package day37_Inheritance;

public class Corolla extends Toyota {

	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi = 4;
	String uretimYeri = "Turkiye";

	public static void main(String[] args) {

		Corolla arb1 = new Corolla();

		Toyota arb2 = new Corolla();

		Araba arb3 = new Corolla();
		
		System.out.println(arb1.calisiyorMu);
		
		System.out.println(arb1.tekerSayisi);
		
		System.out.println(arb1.uretimYeri);
		
		System.out.println(arb2.calisiyorMu);
		
		System.out.println(arb2.tekerSayisi);
		
		System.out.println(arb3.calisiyorMu);
		
		// Ürettiğimiz sınıfa göre ulaşabiliriz.
	}

}
