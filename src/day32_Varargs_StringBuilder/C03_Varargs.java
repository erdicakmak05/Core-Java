package day32_Varargs_StringBuilder;

public class C03_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davranır ama array methodlarıyla çalışır.

		kafanaGoreTopla(5,8,10);
	}

	private static void kafanaGoreTopla(int sayi1,int... sayilar ) {
		
		int toplam = 0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("İlk sayi ile diğerlerinin toplamının çarpımı : " + sayi1*toplam );
	}
	

}
