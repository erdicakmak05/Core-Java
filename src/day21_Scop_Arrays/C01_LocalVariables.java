package day21_Scop_Arrays;

public class C01_LocalVariables {
	
	String okulIsmi;

	public static void main(String[] args) {

		// Java local variablara default değer ataması yapmaz.
		// Kodlarımızda sorun yaşamamak için oluşturduğumuz local variablara uygun bir değer 
		// atamamamızda fayda var.
		
		int sayi = 0 ; // int sayi; dersek java CTE veriyor.
		System.out.println(sayi);
		
		// int sayi; // bir localde aynı isimde birden fazla variable oluşturulamaz.
		
		// String sayi; // Data türü farklı olsada Java buna izin vermez
		
		String isim="Ali";
		
		
	}
	
	public static void staticMethod() {
		//sayi; // Bir localde olşturulan variable farklı localde kullanılamaz 
		String isim ="Veli";
	}

}
