package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// Verilen 2 array i birleştiren ve sonucu birlesikArray isminde bir arraya atayan 
		// bir metot oluşturunuz.
		
		int arr1[] = {5,9,7,5,2,3};
		int arr2[] = {2,4,6,8,9};
		
		int uzunluklarToplami = arr1.length+arr2.length;
		
		int birlesikArray[] = new int [uzunluklarToplami];
		int j = 0;
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[j]+=arr1[i];
			j++;
		}

		int k = 0;
		for (int i = j; j < uzunluklarToplami; j++) {
			birlesikArray[j]+=arr2[k];
			k++;	
		}
		
		System.out.println(Arrays.toString(birlesikArray));

	}

}
