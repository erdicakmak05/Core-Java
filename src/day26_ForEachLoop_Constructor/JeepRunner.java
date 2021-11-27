package day26_ForEachLoop_Constructor;

public class JeepRunner {

	public static void main(String[] args) {

		// Jeep klasından bir obje oluşturalım ve özelliklerini yazdıralim
		
		Jeep jeep1 = new Jeep();
		
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil = 2015;
		jeep1.fiyat = 15000;
		
		System.out.println(jeep1.fiyat+ " "+ jeep1.ilanNo + " " + jeep1.marka + " " + jeep1.model+" "+jeep1.yil);
		
		
		jeep1.hiz(150);
		jeep1.yakit("benzin");
	}

}
