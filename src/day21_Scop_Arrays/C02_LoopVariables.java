package day21_Scop_Arrays;

public class C02_LoopVariables {

	public static void main(String[] args) {

		int sayi = 10;
		
		for (int i = 0; i < 6; i++) {
			String isim = "Ali";
			System.out.println(sayi+ " "+isim);
		}
		
		// System.out.println(isim);	
		// System.out.println(i);
		
		// Loop içerisinde oluşturulan variable'lar loop dışında kullanılamazlar
		// bunun için loop dışındada ihtiyacimiz olan bir değişken varsa 
		// loopdan önce oluşturur ve emniyette kalmak için initialize yapariz.
		
		for (int i = 0; i < 10; i++) {
			// int sayi=20; // sayi variable i main methodun içindeoluşturulduğundan tüm main method da geçerlidir, 
							// dolayısı ile aynı isimde bir variable oluşturamazsınız.
			@SuppressWarnings("unused")
			String isim = "Veli";
		}
		
		
		
	}

}
