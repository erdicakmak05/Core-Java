package day21_Scop_Arrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {

		int arr[] = {2,4,5,6,78,89};
		
		// tum elementleri yazdırabiliriz
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		// Yada Arrays class'indan yardım alıp d,rel array olarak yazdırabiliriz.
		System.out.println(Arrays.toString(arr));
		
	}

}
