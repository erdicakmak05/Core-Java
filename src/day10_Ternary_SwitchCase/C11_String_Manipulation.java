package day10_Ternary_SwitchCase;

public class C11_String_Manipulation {

	public static void main(String[] args) {
		// String olan bir de�i�kenin + ile ba�ka bir de�i�kenle i�leme sokulursa Java bunlar� yanyana ekler.
		
		String isim = "Ali";
		String soyad = "Can";
		
		System.out.println(isim+" "+soyad);
		
		//Ayn� i�lemi String.concat() metodu ilede yapabiliriz.
		
		System.out.println(isim.concat(soyad));
		
		System.out.println(isim.concat(" "+soyad));
		
	}

}
