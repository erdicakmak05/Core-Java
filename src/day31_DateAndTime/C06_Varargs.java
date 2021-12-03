package day31_DateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// Verilen sayıları toplayan bir metot olustrumak istiyorum
		
		
		int a =10;
		int b =20;
		int c =30;
		int d =50;
		int e =60;
		int f =70;
		
		topla(a,b);
		topla(a,b,c);
		topla(a,b,c,d,e);
		topla(a,b,c,d,e,f);
		
		// Suana kadar gordugumuz tekniklerle degisken sayida parametreli  tek bir metot olusturamayız.
		// variaty arguments
		
		

	}

	private static void topla(int... a) {
		
		System.out.println("varargs calisir ");
		
	}

	private static void topla(int a, int b, int c) {
		
		System.out.println("Üç sayının toplami: " +(a+b+c));
		
	}

	private static void topla(int a, int b) {

		System.out.println("İki sayının toplami: " +(a+b));
	}

}
