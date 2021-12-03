package day32_Varargs_StringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davranır ama array methodlarıyla çalışır.

		topla(5,8,10);
	}

	private static void topla(int... sayilar ) {
		
		int toplam = 0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("Girilen sayının toplamı : " + toplam );
	}
	

}
