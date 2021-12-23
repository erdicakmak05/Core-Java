package day48_Maps_TheEnd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// Soru 3 ) Verilen map’te istenen programlama dilini bilen kisileri list olarak
		// 			donduren bir method yaziniz.
		// map e { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil : java
		// Sonuc : [Ali, Veli]
		
		Map<Integer,String> soruMap = MapOlustur.myMap();
		
		String istenenDil = "java";
		
		System.out.println(dilenBilenListesiOlustur(soruMap,istenenDil));

	}

	private static List<String> dilenBilenListesiOlustur(Map<Integer,String> soruMap,String istenenDil) {
		
		List<String> dilBilenListesi = new ArrayList<>();
		
		//soruMap.values(); // bana collention döndürüyor.
		
		List<String> valueList = new ArrayList<>(soruMap.values());
		// valueList --> // eleman sayisi 3 [Ali, Can, java, Veli, Yan, java, Ali, Yan, C#]
		// bu üç elemanı tek tek ele alıp split ile bölüp 
		// dil değeri verilen inputa eşit olanların 
		// isim değerlerini dilBilenler listeme ekliyeceğim.
		String parcaliArr[] = new String[3];
		
		for (String each : valueList) {
			parcaliArr=each.split(", ");  //[Ali, Can, Java]  --> 3 elemanlı bir array getirecek.
			if(parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}
		}

		
		
		return dilBilenListesi;
		
		
	}

}
