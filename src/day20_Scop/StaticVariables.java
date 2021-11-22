package day20_Scop;

public class StaticVariables {
	
	static int no = 20;
	static int sayi;
	static String adres = "Ankara";
	static String cadde ;
	static boolean aktifMi = true; 
	static boolean tatildeMi;
	
	// Eğer static ise objeler oluşturamıyoruz. Bu değerler bir containerda saklanır.
	
	// Class variable da denir, Classin içinde her yerden ulaşılabilir.
	

	public static void main(String[] args) {
		
		// static variablara main methoddan direk ulasilabilir mi / EVET
		
		System.out.println(no); // 20
		no++;
		System.out.println(no); // 21
		staticMethod();
		System.out.println(no);
		
		StaticVariables obje = new StaticVariables();
		obje.staticOlmayanMethod(); // 23
		

		
	}
	
	public static void staticMethod() {
		// static variablara main methoddan direk ulasilabilir mi / EVET
		no++;
		System.out.println("static method'da sayi ->" + no);
	}
	
	public void staticOlmayanMethod() {
		// static variablara main methoddan direk ulasilabilir mi / EVET
		no++;
		System.out.println("static olmayan method'da sayi ->" + no);

	}
	
	
}
