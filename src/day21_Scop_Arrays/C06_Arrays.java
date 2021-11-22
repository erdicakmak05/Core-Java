package day21_Scop_Arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		// Soru 2: Verilen bir array’in tum elemanlarini toplayan bir program yazalim.
		
		int arr[]= {1,2,3,4,5};
		
		int toplam = 0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		System.out.println("Elemanlar Toplami : " +toplam);
		
		// Arrayin tüm elemanlarini önce küçükten büyüğe sonra büyükten küçüğe yazdırın
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//Büyükten küçüğe 
		// ya for loop ile elemanaları yazdırabiliriz
		
		for (int i = arr.length-1; i >= 0; i--) {
		
			System.out.print(arr[i]+ " ");
		}
		
		// array yapmak istersek aynı uzunlukta bir array oluşturup 
		// elemanları ters sırada yeni arraye tasiyabilirsiniz.
		
		int tersArray[] = new int[arr.length];
		System.out.println();
		
		System.out.println(Arrays.toString(tersArray));
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
			
		}
		System.out.println(Arrays.toString(tersArray));
		
		
		
		
		
		
	}

}
