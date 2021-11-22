package day17_ForLoops;

public class C07_NestedForLoop {

	public static void main(String[] args) {

		// 1'den  4 e kadar sayıları yanyana aralarında bir boşuk bırakarak yazdırın.
		
		for (int satir = 1; satir <= 10; satir++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(satir*i+" ");
			}
			System.out.println();
		}
		
	}

}
