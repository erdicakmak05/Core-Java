package day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// Verilen bir arrayden istenen değere sahip elemenleri silip kalanı yeni bir array olarak kaydedin
		// ve sonra yeni array i yazdırın.
		
		int arr[] = {3,4,5,6,3,5,8,1,4,9};
		
		int silinecekEleman = 3;
		int sayac = 0;
		
		//arrayde yeni elelman ekleyemeyiz veya var olan elamanları silemeyiz
		// cunku array'in declare edilen uzunlugu değişmez.
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		int yeniArrayUzuluk = arr.length-sayac;
		
		int arr2[] = new int[yeniArrayUzuluk];
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				arr2[j]+=arr[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr2));

	}

}
