package day25_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {

		// verilen bir arrayde tekrar eden elementleri sadece bir kere yazarak unique elementlerden 
		// oluşan bir element haline getirelim.
		
		int arr[] = {1,5,6,8,2,3,678,2,69,23,2,6,4,2};
		
		List <Integer> tekrarsiz = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
		}
		
		System.out.println(tekrarsiz);
		
		int tekrarsizArray[] = new int [tekrarsiz.size()];
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i]+=tekrarsiz.get(i);
		}
		
		System.out.println("Tekrarsız Array : "+Arrays.toString(tekrarsizArray));
		
		
	}

}
