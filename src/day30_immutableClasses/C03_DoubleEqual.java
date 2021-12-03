package day30_immutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		// Javada String iki türlü olusturulabilir.
		// 1- non-primitive oldugu için new keyword ile
		//  java once eşitliğin sağına baktıgından 
		//  new kelimesi oldugu için once obje olusturulur
		//  sonra degeri atar
		//  Yani bu olusturuma seklinde her zaman
		//  yeni bir obje olusturur.
		
		// 2- Bugune kadar ogrendigimiz gibi olusturursak
		//  String str2= "Mustafa"
		// Java budurmda eşitliğin sağında olan 
		// String'in STRİNG HAVUZUNDA  olup olmadıgını kontrol eder
		// ve havuzda varsa yeni obje olusturmaz, oncekinin refaransina 
		// yeninin referansınıda ekler.
		
		String str1 = "Mustafa";
		String str2 = "Mustafa";
		
		String str3 = new String("Mustafa");
		String str4 = new String("Mustafa");
		
		System.out.println(str1 == str3); // false
		System.out.println(str1.equals(str3)); // true
		
		System.out.println(str4 ==str3);  //false
		System.out.println(str4.equals(str3)); // true
		
		System.out.println(str1==str2);  //true ?
		

	}

}
