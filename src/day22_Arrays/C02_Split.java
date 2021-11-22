package day22_Arrays;

import java.util.Arrays;

public class C02_Split {

	public static void main(String[] args) {
		// "Java öğrenmek çok güzel"
		// cümlesinin kelimelerini ters sırada yazdırın.
		
		String str = "Java öğrenmek çok güzel";
		
		String arr1[] = str.split(" ");
		
		System.out.println(Arrays.toString(arr1));
		
		for (int i = arr1.length-1; i >= 0; i--) {
			System.out.print(arr1[i] + " ");
		}

	}

}
