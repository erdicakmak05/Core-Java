package day12;

public class day11_day12_workSheet {

	public static void main(String[] args) {
		
		String str1 = "Meryem �akmak";
		
		String str2 = "Erdi �akmak";
		
		String str3 = "Erdi �akmak";
		
		String str4 = "meryem �akmak";
		
		// Equals 
		
		// String ifadenin ayn� olup olmad���n� kontrol eder.
		
		boolean ayniMi = str1.equals(str2);
		
		System.out.println(ayniMi);
		
		System.out.println(str2.equals(str3));
		
		//EqualsIgnoreCase
		
		// String ifadenin b�y�k-k���k harf olup olmad���n� bakmadan sadece harfleri kontrol eder.Sensitive de�il
		
		System.out.println(str1.equalsIgnoreCase(str4)); // True
		
		//Lenght de�i�kenin harf say�s�n� verir. 
		
		System.out.println(str1.length());  //13 Meryem �akmak
		
		// IndexOf - String de�er i�inde karakter yada ba�ka bir string de�er aramama�z� sa�lar
		
		int a1 = str1.indexOf("�a");
		
		System.out.println(a1);
		
		// LastIndexOf - String de�erin sonunda ba�layarak belirli stringi yada char de�eri arar, buldu�undan ba�tan ba�larak
		//               string yada karakterin oldu�u indexi bulur.
		
		System.out.println(str1.lastIndexOf("a"));
		
		//Contains - String i�inde belirtti�imiz string yada char de�eri var m� yok mu kontrol eder , True False d�nd�r�r.
		
		System.out.println(str1.contains("ak"));
		
		
	}

}
