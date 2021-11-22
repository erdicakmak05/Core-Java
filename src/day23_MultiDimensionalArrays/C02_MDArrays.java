package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		// MultiDimasional arrayler iç içe konulmuş arrayler demektir.
		// Array oluşturmak için 2 yöntemimiz vardı
		// 1. yöntem önce declare edip sonra değer atama
		
		int arr [][] = new int [3][2]; // outer arrayi 3 elemanlı , 
									   // her bir inner array ise 2 elemanlı olan MDArray oluşturur.
		// Bu yöntemle oluşturduğumuzda inner arraylerin hepsi aynı boyutta olmalıdır.
		
		System.out.println(Arrays.toString(arr)); // direk outer array i yazdırmak istediğimizde 
												  // içindeki elemanlar non-primitive oldğundan referansları yazdırır.
												  // [[I@4c203ea1, [I@27f674d, [I@1d251891]
		
		System.out.println(Arrays.toString(arr[1])); // [0, 0]
		System.out.println(Arrays.toString(arr[2])); // [0, 0]
		
		System.out.println(Arrays.deepToString(arr)); // [[0, 0], [0, 0], [0, 0]]
		
		arr[0][1] = 5 ; 
		arr[1][0] = 2 ;
		arr[2][1] = 3 ;
		
		System.out.println(Arrays.deepToString(arr)); // [[0, 5], [2, 0], [0, 3]]
		
		// Array oluşturmak için 2 yöntemimiz vardı
		// 2. yöntem hem declare edip hem değer atama
		
		int arr2 [][] = {{0},{1,2,3},{6,7,8,9}};
		
		System.out.println(Arrays.toString(arr2[1])); // [1, 2, 3]
		
		System.out.println(arr2[2][1]);  // 7

	}

}
