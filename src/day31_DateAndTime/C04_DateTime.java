package day31_DateAndTime;

import java.time.LocalTime;

public class C04_DateTime {

	public static void main(String[] args) {
		// Bir String ve int variable olusturalım
		// bir loop içerisinde bu variable lari 1000 kere deiştirelim 
		// ve işlem sürelerini kiyaslayalim.
		
		
		LocalTime saatS = LocalTime.now();
		
		System.out.println("Baslangıc saati : "+saatS);
		
		String str="ahmet";
		
		for (int i = 0; i < 1000; i++) {
			str+=" ";
			
		}
		LocalTime saatBitisS = LocalTime.now();

		System.out.println("Bitiş saati" + saatBitisS);
		
		// Eğer bir islemin baslangıc ve bitis zamanını kaydetmek istiyorsak
		// hem basında, hem sonunda LocalTime objesi olusturmalıyız.
		
		double nanoS = saatS.getNano();
		double nanobitis = saatBitisS.getNano();
		
		System.out.println("For loop : " + (nanobitis-nanoS) + " nano saniyede tamamlandı");
	}

}
