package day23_MultiDimensionalArrays;

import java.util.Scanner;

public class C05_Array {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		//	Herşey java ile kolay.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Cümle giriniz.");
		String str = scan.nextLine();
		
		String arr[] = str.split(" ");
		
		System.out.println(arr.length-1);
		
		
	}

}
