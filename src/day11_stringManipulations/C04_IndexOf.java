package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		
		// Parametre olarak girilen bir char veya Stringin buldu�u ilk indexini verir
		
		String str = "Cal�s�rsan�z Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s'));  //4
		System.out.println(str.indexOf("J"));  //13
		
		int index = str.indexOf("r");
		System.out.println(str.indexOf(index));
		
		System.out.println(str.indexOf("t")); // -1
		
		// burada bulunamayan karakter i�in indexOf -1 d�nd�r�r.
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.indexOf('a',11)); // 11 den sonraki a y� arar 	
		
				
				
	}

}
