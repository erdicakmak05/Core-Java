package day32_Varargs_StringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		
		// varargs list gibi davranır ama array methodlarıyla çalışır.

		kafanaGoreTopla(5,8,10,13,0);
	}

	private static void kafanaGoreTopla(int sayi1,int sayi2,int... sayilar ) {
		
		int toplam = 0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("İlk sayi ile diğerlerinin toplamının çarpımı : " + sayi1*toplam );
	}
	

}
