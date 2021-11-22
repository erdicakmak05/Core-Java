package day19_While_Loop_Do_While;

public class C04_DoWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		
		while (i<5) {
			
			System.out.print(i+" ");
			i++;
		}
		
		// while loop önce kontrol eder sonra kodu çalıştırır
		// loop içinde artis yapilsada bir sonraki kontrole kadar kod çalışmaya devam eder 
		// buda bağzı durumlarda hatali sonuçlara ulaşmamıza sebep olabilir.
		
		//do-while loop ise önce islemi yapar ve sonra şarto kontrol eeder
		// özellikle kullanicidab değer almalarda do while loop tercih edilir.
		
		int a = 0;
		 
		do {
			System.out.println(a + " ");
			a++;
		}while(a<5);
	}

}
