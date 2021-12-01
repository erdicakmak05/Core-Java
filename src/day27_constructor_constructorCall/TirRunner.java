package day27_constructor_constructorCall;

public class TirRunner {

	public static void main(String[] args) {
		// Bir tane tüm özellikleri değiştiren construcktor oluşturalım
		
		Tir tir1 = new Tir(5000,"axor","beyaz",2020,false);
		
		System.out.println(tir1.km+ " "+ tir1.model+ " "+ tir1.renk + " "+ tir1.yil+ " "+ tir1.satilikMi);
		
		// uc özelliği değştiren bir parametreli contructor olusturalım
		// int km, string model, string renk
		
		Tir tir2= new Tir(110000,"volvo","kırmızı");
		
		System.out.println(tir2.km+ " "+ tir2.model+ " "+ tir2.renk + " "+ tir2.yil+ " "+ tir2.satilikMi);

	}

}
