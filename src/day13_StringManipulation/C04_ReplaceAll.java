package day13_StringManipulation;

public class C04_ReplaceAll {

	public static void main(String[] args) {

		String str = "*Java 98ogrenmek c..ok k876olay";
		
		//replaceAll methodlar� kullanarak Java Ogrenmek �ok kolay yapaca��z
		
		
		str= str.replaceAll("\\d", "");
		System.out.println(str);
		
		str= str.replaceAll("\\s", "x");
		
		//K���k w harfleri kald�r� b�y�k W harf olmayanlar� kald�r�r bo�lukta dahil
		
		str=str.replaceAll("\\W", "");
		System.out.println(str);
		
		str = str.replaceAll("x", " ");
		System.out.println(str);
	} 

}
