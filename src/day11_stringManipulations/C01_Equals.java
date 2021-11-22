package day11_stringManipulations;

public class C01_Equals {

	public static void main(String[] args) {

		int a = 10;
		int b = a + 0;

		System.out.println(a == b);

		char ch1 = 'K';
		char ch2 = 'K' + 0;

		// Char --> Matematiksel deðer aldýðý için 75 + 0 = 75 diyoruz aslýnda bundan
		// dolayý True dönüyor

		System.out.println(ch1 == ch2); // True

		String str1 = "Ali";
		String str2 = "Can";
		String str3 = "Ali Can";

		String str4 = str1 + " " + str2; // Ali Can

		System.out.println(str3 == str4); // False
		
		// == referanslarada bakar 
		
		// Deðerler ayný ama objeler farklý, Stringde referans numarasýda kontrol
		// edilir, Equalsda sadace karakterlere bakar
		System.out.println(str3.equals(str4)); // Burada equals kullandýk true döndürdü.
		
		

	}

}
