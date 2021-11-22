package day10_Ternary_SwitchCase;

public class C11_String_Manipulation {

	public static void main(String[] args) {
		// String olan bir deðiþkenin + ile baþka bir deðiþkenle iþleme sokulursa Java bunlarý yanyana ekler.
		
		String isim = "Ali";
		String soyad = "Can";
		
		System.out.println(isim+" "+soyad);
		
		//Ayný iþlemi String.concat() metodu ilede yapabiliriz.
		
		System.out.println(isim.concat(soyad));
		
		System.out.println(isim.concat(" "+soyad));
		
	}

}
