package day32_Varargs_StringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		

		topla(5,8,10);
		
		// varargs'dan once farklı parametreler kullanılabilir
		// ama varargs'dan sonra parametre yazılamaz
		// yazarsanız java vararg son parametre olmalıdır diye sizi uyarır.
		// ve CTE verir.
	}

	private static void topla(int... sayilar) {
		
		int toplam = 0;
		for (int each : sayilar) {
			toplam+=each;
		}
		System.out.println("Girilen sayının toplamı : " + toplam );
	}
	

}
