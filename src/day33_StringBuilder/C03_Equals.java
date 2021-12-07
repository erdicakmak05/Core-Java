package day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Java");
		
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2));  // false   Stringden farklı olarak içeriye bakmaz.
		
		System.out.println(sb1.compareTo(sb2)); // 0
		
		// İlk harflerden başlıyarak birebir StringBuilder lari karsılastırı. Tüm karakterler aynı ise sonuc olarak 0 döner.
		// farkli karakter bulursa - deger yada + deger döndürür.
		
		
		// eger 2 string builderin eşit olup olmadıgını anlamak istersek
		// if(sb.compareTo(sb2)==0) ile kontrol edebiliriz.
		
		String str = "Java";
		
		// System.out.println(sb1==str);   karşılaştırılamazlar.
		
		System.out.println(sb1.equals(str));  // false farklı türler karşılaştırılamazlar.
		
		//System.out.println(sb1.compareTo(str));  // compareTo string değer için kullanılamaz.
		
		//System.out.println(sb1=="Java");
		
		System.out.println(sb1.equals("Java"));  // false 
		
		//System.out.println(sb1.compareTo("Java"));

		
		
	}

}
