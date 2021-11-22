package day18_NestedForLoop_While_Loop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplamak üzere sayi isteyin 
		// kullanıcı 0 a basıncaya kadar sayilari alip toplamaya devam edin.
		// kullanıcı 0 a bastığında o ana kadar kaç sayı girdiğini ve girilen 
		// sayiların toplamini yazdırın.
		
		Scanner scan = new Scanner (System.in);
		int sayi = -1;
		int toplam = 0;
		int sayac = 0;
		while(sayi!=0) {
			System.out.println("Toplamak istediğniz sayiyi girin çıkmak ve sonuç almak için 0 a basın");
			sayi = scan.nextInt();
			toplam+=sayi;
			sayac++;
		}
		System.out.println((sayac-1)+" degerin toplamı = "+toplam);
		scan.close();
	}

}
