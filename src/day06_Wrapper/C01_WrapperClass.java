package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {

		int sayi1 = 10;
		Integer sayi2 = 20;
		
		// sayi1 yazd���m�zda hi�bir method ��kmaz c�nk� sayi1 int dir yanii primitive data tipidir.
		// sayi2 yazd���m�zda bir �ok methof geliyor, ��nk� sayi2 integer dir yani wrapper classd�r.
		
		
		String tel1 = "35789785";
		String tel2 = "32456894";
		
		System.out.println(tel1+tel2);
		
		// bu say�lar� toplamak istersek 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
				
	
	}

}
