package day13_StringManipulation;

public class day13_Tekrar {

	public static void main(String[] args) {
		
		String str1= "Meryem Konur �akmak";
		
		str1.startsWith("Meryem"); //True
		System.out.println(str1.startsWith("Meryem"));
		
		str1.startsWith("�akmak"); //True
		System.out.println(str1.endsWith("�akmak"));
		
		str1.replace("e", "a");
		System.out.println(str1.replace("e", "a"));
		
		str1.replace("Konur", "�akmak");
		System.out.println(str1.replace("Konur", "�akmak"));
		
		str1.concat(" G�zleri");
		System.out.println(str1.concat(" G�zleri"));
		
		str1.replaceAll("�akmak", "Konur");
		System.out.println(str1.replaceAll("�akmak", "Konur"));
		
		//str1 = str1.replaceAll("[^ a-zA-Z]","" ); // Bo�luklar� ve �zel karakterleri kald�rmak i�in bunu kullanabiliriz,
		
		str1.replaceAll("\\w", "*");
		System.out.println(str1.replaceAll("\\w", "*"));
		
		str1.substring(7, 11);
		System.out.println(str1.substring(7, 12));


	}

}
