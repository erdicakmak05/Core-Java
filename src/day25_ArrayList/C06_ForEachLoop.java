package day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile hiç uğraşmadan  bir array veya listedeki tüm elemanları gözden geçirmek 
		// isteriz.
		
		int arr[] = {1,2,3,4,5,6};
		
		// Bu arrayi esnek bir list yapmak istiyorum.
		
		List<Integer> yeniList = new ArrayList<>();
		
		/*for (int i = 0; i < arr.length; i++) {
			yeniList.add[arr[i]];
		}
		
		System.out.println(yeniList);*/
		
		for (int each : arr) { // arr deki her bir integer i bana getir
			
			yeniList.add(each);
			
		}

	}

}
