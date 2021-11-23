package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// list oluşturalım
		
		List <String> isimList = new ArrayList<>();
		
		List <String> isimList2 = new ArrayList<String>();
		// bazen list oluştuturken  eşitliğin sağınada data türü yazmamızı isteyebilir.
		// ama genelde sorun çıkmaz, biz yinede sağ tarafa data türünü yazalım
		
		List <String> isimList3 = new ArrayList<String>();
		
		// eşitliğin sağında List değil ArrayList kullanabiliyoruz
		
		List <Integer> sayilar = new ArrayList<>();
		
		// List data türü olarak primitive data type lari kabul etmez.
		
		List <Boolean> cevaplar = new ArrayList<>();
		


	}

}
