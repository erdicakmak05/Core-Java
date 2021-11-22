package day03_Scanner;

public class C03_SwapVariables2 {

	public static void main(String[] args) {

		 // 2- Verilen sayi1 ve sayi2 variable�larinin degerlerini 
        //    3.bir variable olmadan degistiren (SWAP) bir program yapiniz
        
        int sayi1=15;
        int sayi2=20;
        
        // baslangicta sayi1=10 ve sayi2=20
        
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        // ���nc� bir variable kullanamyacaksak, verilen 2 say�n�n fark�ndan istifade ediyoruz.
        
        // �lk ad�m olarak sayilar�n fark�n� ilk say�ya at�yoruz.
        
        sayi1=sayi1-sayi2; //-5
     
        // �kinci ad�m : fark ile sayi2 yi toplay�p say�2 ye at�yoruz.
        
        sayi2=sayi1+sayi2; //15
        
        // ���nc� Ad�m : sayi1'e sayi2 - fark at�yoruz.
        
        sayi1= sayi2-sayi1;
        
        System.out.println("baslangicta sayi1=" + sayi1 + " ve sayi2=" + sayi2);
        
        
	}

}
