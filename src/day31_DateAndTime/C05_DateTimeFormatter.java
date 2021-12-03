package day31_DateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();

		System.out.println(tarihSaat); // 2021-12-02T23:45:03.321085800

		// Eğer tarih ve saati kendi istediğimiz biçimde yazdırmak istersek
		// gun / ay / yil saat:dakika

//		 * yy:   Yilin son iki rakamini
//		 * y:    Yilin tamamini
//		 * M:    Ay sirasini verir
//		 * MM:   Ay sirasini verir
//		 * MMM:  Ay isminin ilk uc harfini verir
//		 * MMMM: Ay isminin tamamini verir
//		 *
//		 *  Ay buyuk M ile belirtilmeli dakika( minute) ile
//		 *  cakismamasi icin.

		DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd / MM / YYYY  HH : mm");
		
																//DD yaparsak yılın gününü verir.
																//EEE Günün ismini veriyor. 
																//    MMM Yazarsak ayın Strin olarak kısaltmalı verir. Exp : Dec
																//    MMMM Yazarsak ayın String halini uzun veriyor. Exp : December
																//          YY Yazarsak yılın son 2 hanesini yazıyor Exp : 21
		
		System.out.println(duzenle.format(tarihSaat));  // 02 / 12 / 2021  23 : 52

	}

}
