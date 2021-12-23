package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		Map<Integer, String> ornek = MapOlustur.myMap();
		
		//Map<Integer,String,Integer> map2 = new HashMap<>();
		System.out.println(ornek);
		
		System.out.println(ornek.containsKey(110)); // false
		
		
		System.out.println(ornek.containsValue("java")); // false
		
		System.out.println(ornek.containsValue("Veli, Yan, java")); // true
		
		Set<Entry<Integer, String>> entrySet = ornek.entrySet();  // herbir eleman entry 101=Ali, Can, java gibi
		
		int sayac = 1 ;
		
		for (Entry<Integer, String> each : entrySet) {
			
			System.out.println(sayac + " . entry : " + each );
			
			sayac++;
		}
		
		System.out.println(ornek.getOrDefault(110, "girilen key map'de yok")); // girilen key map'de yok
		System.out.println(ornek.getOrDefault(103, "girilen key map'de yok")); // Ali, Yan, C#
		
		ornek.putIfAbsent(103, "Ali, Yan, C#"); // VARSA EKLEMEZ YOKSA MAP'a EKLER.
		
		ornek.putIfAbsent(110, "Fikri, Yan, Qa");
		
		System.out.println(ornek);
		
		String maptenString = ornek.toString();
		System.out.println(maptenString);

	}

}
