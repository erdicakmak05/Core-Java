package day13_StringManipulation;

public class C02_Replace {

	public static void main(String[] args) {

		// String olarak verilen 10.000 say�s�n�n
		// binden bu�y�k olup olmad���n� yazd�r�n
		
		String sonuc ="10.000";
		String str = "Canan Can";
		
		sonuc = sonuc.replace(".", "");
		// Bulursa de�i�tirir, bulmaz ise problem olmaz
		
		if (Integer.valueOf(sonuc)>1000) {
			System.out.println("1000 den fazla");
		} else {
			System.out.println("100 den az");
		}
		System.out.println(str.startsWith("a",3));
	}

}
