package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {

		int x = 10;
		int y =5;

		String tekmiCiftMi = x % 2 == 0 ? "�ift sayi" : "tek sayi";

		System.out.println(tekmiCiftMi);

		System.out.println(x % 2 == 0 ? "�ift sayi" : "tek sayi");

		// Ternary 2 T�rl� kullan�labilir
		// Ya d�nen sonuca g�re bir variable olu�turup assign ederiz
		// veya direk print edip sonucu yazd�r�r�z
		
		//E�er ternaryden d�nen sonu�lar ayn� data t�r�nden de�ilse atama yapamay�z
		//sadece print edip yazd�rabiliriz.
		System.out.println(x > 5 ? "Aferin" : 4); // Aferin

		// String sonuc = x > 5 ? "Aferin" : 4;
		
		int yeniDeger = x<5 ? x++ : y++;
		
		
	}

}
