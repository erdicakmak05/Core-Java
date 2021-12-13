package day35_Encapsulation_Inheritance;


public class C02_Setter {

	public static void main(String[] args) {
		
		// Öğretmenler ogrencinin notunu girebilsin ama 
		// ama tüm notları göremesin sadece geçip gecemediğini görsün.

		C01 ogr1 = new C01();
		
		
		ogr1.setNot(60);
		
		System.out.println(ogr1.isGecerMi());
		
		
	}

}
