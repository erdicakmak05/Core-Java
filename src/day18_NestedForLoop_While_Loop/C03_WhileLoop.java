package day18_NestedForLoop_While_Loop;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// 20'den 30 a kadar olan sayıları (20 30 dahil)
		// while loop ile yazdırın
		
		for (int i = 20; i <= 30; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println("");
		
		int sayi = 20;
		while(sayi<=30) {
			System.out.print(sayi +  " ");
		sayi++;	
		}
		
		

	}

}
