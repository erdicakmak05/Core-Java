package day13_StringManipulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {

		String str = "*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlarý kullanarak Java Ogrenmek Çok kolay yapacaðýz
		
		
		str= str.replaceAll("\\d", "");
		System.out.println(str);
		
		str= str.replaceAll("\\s", "x");
		
		//Küçük w harfleri kaldýrý büyük W harf olmayanlarý kaldýrýr boþlukta dahil
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);
		
		str = str.replaceAll("x", " ");
		System.out.println(str);
	} 

}
