package day29_StaticBlock_passByValue;

public class C02_PassBy {

	public static void main(String[] args) {
		// biz 100 tl ye satilan bir ürün için 2 farklı indirim uygulayan 2 farklı metot olusturalım
		
		int fiyat = 100;
		
		indirimYap25(fiyat); //75
		System.out.println("methoddan sonra main method'daki fiyat : "+ fiyat);//100
		indirimYap10(fiyat); //90
		System.out.println("methoddan sonra main method'daki fiyat : "+ fiyat); //100


	}
	
	private static void indirimYap25(int fiyat) {
		
		fiyat*=0.75;
		System.out.println("%25 indirimli fiyat : " + fiyat);
	}

	private static void indirimYap10(int fiyat) {
		
		fiyat*=0.90;
		System.out.println("%10 indirimli fiyat : " + fiyat);
	}

}
