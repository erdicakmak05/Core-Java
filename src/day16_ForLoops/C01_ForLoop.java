package day16_ForLoops;

public class C01_ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			
		}
		
		// for loop baslangıc ve bitis sarti bir sayiyin degerine bagli olan
		// durumlarda tercih eder.
		
		/*for (int i = 0; i < 10; i--) {
			
			System.out.println(i + " ");
			
		}*/
		
		// eğer başlangıc sayısı artış/azalış ile bitis değerine yaklaşmıyor uzaklaşıyor ise loop sonsuz döngüye girer.
		
		for (int i = 0; i > 10; i++) {
			System.out.println(i);
		}
		
		// eğer ilk değer için bitiş şartı true olmaz ise daha ilk adımda loop broken olur 
		// loop body hiç çalışmadan loop'un sonrasına geçilir.
		// loop çalışır ama hiçbirşey döndürmez.
	}

}
