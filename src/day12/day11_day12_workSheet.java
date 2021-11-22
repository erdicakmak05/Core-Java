package day12;

public class day11_day12_workSheet {

	public static void main(String[] args) {
		
		String str1 = "Meryem Çakmak";
		
		String str2 = "Erdi Çakmak";
		
		String str3 = "Erdi Çakmak";
		
		String str4 = "meryem çakmak";
		
		// Equals 
		
		// String ifadenin ayný olup olmadýðýný kontrol eder.
		
		boolean ayniMi = str1.equals(str2);
		
		System.out.println(ayniMi);
		
		System.out.println(str2.equals(str3));
		
		//EqualsIgnoreCase
		
		// String ifadenin büyük-küçük harf olup olmadýðýný bakmadan sadece harfleri kontrol eder.Sensitive deðil
		
		System.out.println(str1.equalsIgnoreCase(str4)); // True
		
		//Lenght deðiþkenin harf sayýsýný verir. 
		
		System.out.println(str1.length());  //13 Meryem Çakmak
		
		// IndexOf - String deðer içinde karakter yada baþka bir string deðer aramamaýzý saðlar
		
		int a1 = str1.indexOf("Ça");
		
		System.out.println(a1);
		
		// LastIndexOf - String deðerin sonunda baþlayarak belirli stringi yada char deðeri arar, bulduðundan baþtan baþlarak
		//               string yada karakterin olduðu indexi bulur.
		
		System.out.println(str1.lastIndexOf("a"));
		
		//Contains - String içinde belirttiðimiz string yada char deðeri var mý yok mu kontrol eder , True False döndürür.
		
		System.out.println(str1.contains("ak"));
		
		
	}

}
