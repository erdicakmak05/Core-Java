package day13_StringManipulation;

public class Day13_Q1 {

	public static void main(String[] args) {

		//Soru 1) 	String methodlarini kullanarak � Java ogrenmek123 Cok guzel@ � String�ini �Java
		//			ogrenmek cok guzel.� sekline getirin.
		
		String str1 = " Java ogrenmek123 Cok guzel@ ";
		
		str1 = str1.trim(); // de�erin ba��nda ve sonunda bulunan bo�luklar� temizledik
		
		str1 = str1.replaceAll("\\d", ""); // Digit de�erleri temizledik
		
		str1 = str1.replaceAll("[^ a-zA-Z]","" ); // Bo�luklar� ve �zel karakterleri kald�rmak i�in bunu kullanabiliriz,
		
											   	//aradaki bo�lu�a dikkat
		str1 = str1.charAt(0) + str1.toLowerCase().substring(1);
		System.out.println(str1);
		
		str1 = str1.replaceAll("x", " ");
		System.out.println(str1);
		
		//str1 = str1.replace('C', 'c');
		
		System.out.println(str1);
		
	}

}
