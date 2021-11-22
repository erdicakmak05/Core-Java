package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {

		/*
		 * 1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10
		 */
		
		int sayi1 = 10;
		int sayi2 = 20;

		
		System.out.println("baslangýçta sayi1= "+sayi1 + "ve sayi2 = "+sayi2);
	
		//ilk önce boþ bir variable oluþturalým
		
		int bos;
		
		//sayi2 yi boþ variable atayalim
		bos = sayi2;
		
		//sayi2 variable ina sayi1 degerini atayalým
		sayi2=sayi1;
		
		//bos variable indaki deðeri sayi1 e atayalým
		sayi1=bos;
		
		
		System.out.println("baslangýçta sayi1= "+sayi1 + "ve sayi2 = "+sayi2);

		
	}

}
