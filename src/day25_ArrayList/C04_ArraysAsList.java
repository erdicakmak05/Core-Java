package day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		// Verilen array i Arrays class dan yardım alarak ArrayList e çevirebiliriz.
		
		String arr[] = {"a","b","c","d"};
		
		List <String> arraydenList = Arrays.asList(arr);	
		
		System.out.println(arraydenList);
		
		//arraydenList.add("f"); // RTE  // Exception in thread "main" java.lang.UnsupportedOperationException
							   // CTE olmasi için syntax de hata olması gerekir, yazımda syntax hatası yok 
		// Bu şekilde Arrays classından yardım alarak array i liste çevirirsek 
		// oluşturduğumuz listin boyutu sabit olur dolayısiyla add methodu yada clear gibi metotları çalıştırmak istersekl 
		// UnsupportedOperationException  hatası verir.
		
		arr[1] = "Z";
		
		System.out.println("Arrayi değiştirdikten sonra ArrayList : "+arraydenList);

	}

}
