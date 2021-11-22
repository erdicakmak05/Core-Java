package day13_StringManipulation;

public class day13_Tekrar {

	public static void main(String[] args) {
		
		String str1= "Meryem Konur Çakmak";
		
		str1.startsWith("Meryem"); //True
		System.out.println(str1.startsWith("Meryem"));
		
		str1.startsWith("Çakmak"); //True
		System.out.println(str1.endsWith("Çakmak"));
		
		str1.replace("e", "a");
		System.out.println(str1.replace("e", "a"));
		
		str1.replace("Konur", "Çakmak");
		System.out.println(str1.replace("Konur", "Çakmak"));
		
		str1.concat(" Gözleri");
		System.out.println(str1.concat(" Gözleri"));
		
		str1.replaceAll("Çakmak", "Konur");
		System.out.println(str1.replaceAll("Çakmak", "Konur"));
		
		//str1 = str1.replaceAll("[^ a-zA-Z]","" ); // Boþluklarý ve özel karakterleri kaldýrmak için bunu kullanabiliriz,
		
		str1.replaceAll("\\w", "*");
		System.out.println(str1.replaceAll("\\w", "*"));
		
		str1.substring(7, 11);
		System.out.println(str1.substring(7, 12));


	}

}
