package day31_DateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {

		LocalDate tarih = LocalDate.now();
		
		
		System.out.println(tarih.getDayOfYear()); // 336 - Yılın 336. yılındayız.
		System.out.println(tarih.getDayOfMonth()); // 2  - Ayın 2. günündeyiz.
		System.out.println(tarih.getDayOfWeek());  //THURSDAY - haftanın günlerini gösteriyor
		System.out.println(tarih.getMonthValue()); // 12 - Hangi ayda oldugumuzu getiriyor.
		System.out.println(tarih.getMonth()); // DECEMBER - Ayı yazılı halde getirir.
		
		
		
		System.out.println(tarih.plusDays(20)); // 20 gün sonra tarih ne olur
		System.out.println(tarih.plusMonths(5)); // 5 ay sonraki tarihi aldık
		System.out.println(tarih.plusWeeks(15)); // 15 hafta sonraki tarihi aldık.
		System.out.println(tarih.plusYears(4)); // 4 sene sonraki tarihi aldık.
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10)); // birlikte kullandık 
		
		System.out.println(tarih.minusDays(20)); // 20 gün önceki tarih
		System.out.println(tarih.minusWeeks(20)); // 20 hafta önce 
		
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5)); // birlikte kullandık
		
		System.out.println(tarih.minusYears(21).isLeapYear()); // 21 yıl önce leap year mi , boolean döndürdü 
		
		LocalDate dogumTarihi1 = LocalDate.of(1998, Month.JANUARY, 12);
		LocalDate dogumTarihi2 = LocalDate.of(2000, 01, 12);
		LocalDate dogumTarihi3 = LocalDate.of(1985, 10, 10);
		
		System.out.println(dogumTarihi1);
		System.out.println(dogumTarihi2);
		
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); //false
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1)); // true
		
		
		
		
		
		
	}

}
