package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {

		int x = 10;
		int y =5;

		String tekmiCiftMi = x % 2 == 0 ? "çift sayi" : "tek sayi";

		System.out.println(tekmiCiftMi);

		System.out.println(x % 2 == 0 ? "çift sayi" : "tek sayi");

		// Ternary 2 Türlü kullanılabilir
		// Ya dönen sonuca göre bir variable oluşturup assign ederiz
		// veya direk print edip sonucu yazdırırız
		
		//Eğer ternaryden dönen sonuçlar aynı data türünden değilse atama yapamayız
		//sadece print edip yazdırabiliriz.
		System.out.println(x > 5 ? "Aferin" : 4); // Aferin

		// String sonuc = x > 5 ? "Aferin" : 4;
		
		int yeniDeger = x<5 ? x++ : y++;
		
		
	}

}
