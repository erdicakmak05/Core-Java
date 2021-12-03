package day31_DateAndTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {

		LocalDateTime tarihSaat = LocalDateTime.now();
		
		System.out.println(tarihSaat);
		
		tarihSaat.toString();
		
		System.out.println(tarihSaat.toString().startsWith("2021"));
	}

}
