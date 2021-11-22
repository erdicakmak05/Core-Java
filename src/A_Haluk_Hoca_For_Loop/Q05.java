package A_Haluk_Hoca_For_Loop;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {

		// Kullanıcıdan 5 adet sayı isteyiniz
		// Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
		// bu soruyu continue kullanarak çözünüz.
		
		Scanner scan = new Scanner(System.in);
		int toplam = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Toplanacak sayiyi giriniz.");
			int sayi = scan.nextInt();
			if(!(sayi>5 && sayi<10)) {
				toplam+=sayi;
				System.out.println(toplam);
			}
			
		}
		System.out.println("Toplam = " + toplam );
		scan.close();
	}

}
