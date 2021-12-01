package day29_StaticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// biz 100 tl ye satilan bir ürün için 2 farklı indirim uygulayan 2 farklı metot olusturalım
		
		int fiyat = 100;
		
		
		
		System.out.println(indirimYap25(fiyat)); //75
		System.out.println("methoddan sonra main method'daki fiyat : "+ fiyat); //100
		
		//indirimi kalıcı yapmak istiyorsak main metotda atama yapmamız gerekir.
		fiyat = indirimYap10(fiyat); 

	}
	
	private static int indirimYap25(int fiyat) {
		
		fiyat*=0.75;
		return fiyat;

	}

	private static int indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		
		return fiyat;
	}

}