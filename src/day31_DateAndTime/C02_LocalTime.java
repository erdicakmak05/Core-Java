package day31_DateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {

		LocalTime saat = LocalTime.now();
		
		System.out.println("Baslangıc saati : "+saat);
		
		int sayi=10;
		
		for (int i = 0; i < 1000000; i++) {
			sayi++;
			
		}
		LocalTime saatBitis = LocalTime.now();

		System.out.println("Bitiş saati" + saatBitis);
		
		// Eğer bir islemin baslangıc ve bitis zamanını kaydetmek istiyorsak
		// hem basında, hem sonunda LocalTime objesi olusturmalıyız.
		
		double nano1 = saat.getNano();
		double nanobitis = saatBitis.getNano();
		
		System.out.println("For loop : " + (nanobitis-nano1) + " nano saniyede tamamlandı");
		
		System.out.println(saat.getMinute());
		System.out.println(saat.plusMinutes(10000));
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat);
		
		
	}

}
