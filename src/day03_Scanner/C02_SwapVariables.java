package day03_Scanner;

public class C02_SwapVariables {

	public static void main(String[] args) {

		/*
		 * 1- Verilen sayi1 ve sayi2 variable�larinin degerlerini degistiren (SWAP) bir program yaziniz
            Orn : sayi1=10 ve sayi2=20;
            kod calistiktan sonra
            sayi1=20 ve sayi2=10
		 */
		
		int sayi1 = 10;
		int sayi2 = 20;

		
		System.out.println("baslang��ta sayi1= "+sayi1 + "ve sayi2 = "+sayi2);
	
		//ilk �nce bo� bir variable olu�tural�m
		
		int bos;
		
		//sayi2 yi bo� variable atayalim
		bos = sayi2;
		
		//sayi2 variable ina sayi1 degerini atayal�m
		sayi2=sayi1;
		
		//bos variable indaki de�eri sayi1 e atayal�m
		sayi1=bos;
		
		
		System.out.println("baslang��ta sayi1= "+sayi1 + "ve sayi2 = "+sayi2);

		
	}

}
