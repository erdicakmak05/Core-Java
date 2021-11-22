package day22_Arrays;

import java.util.Arrays;

public class C03_Split {

	public static void main(String[] args) {
		// "Java öğrendim,  #cok para ?kazandım.,"
		// cümlesinin kelimelerini, özel karakterler ve noktalama işaretleri olmadan 
		// harf sırasına göre yazdıralım
		
		String str = "Java ogrendim,  #cok para ?kazandim.,";
		
		String kelimeler[] = str.split(" ");
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i] = kelimeler[i].replaceAll("\\W", "");
			
			System.out.println(kelimeler[i]);
		}
		
		System.out.println(Arrays.toString(kelimeler));
		Arrays.sort(kelimeler);
		String yeniCumle = "";
		
		for (int i = 0; i < kelimeler.length; i++) {
			yeniCumle+=kelimeler[i]+" ";
		}
		System.out.println(yeniCumle);

	}

}
