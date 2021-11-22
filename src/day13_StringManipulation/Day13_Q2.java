package day13_StringManipulation;

public class Day13_Q2 {

	public static void main(String[] args) {

		/*
		 * Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		 * 
		 * String str1 = “$13.99” String str2 = “$10.55” ipucu : Double.parseDouble()
		 * methodunu kullanabilirsiniz.
		 */

		String str1 = "$13.99";
		String str2 = "$10.55";
		
		str1 = str1.replaceAll("[^0-9]", "");
		
		Integer.valueOf(str1);
		
		double str1Double = Double.valueOf(str1)/100;
		
		
		str2 = str2.replaceAll("[^0-9]", "");
		
		Integer.valueOf(str2);
		
		double str2Double = Double.valueOf(str2)/100;
		
		
		System.out.println(Double.valueOf(str1)/100);
		System.out.println(Double.valueOf(str2)/100);
		
		System.out.println("Toplam = $"+(double)(str1Double+str2Double));

	}

}
