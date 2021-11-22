package day06_Wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {

		int sayi1 = 10;
		Integer sayi2 = 20;
		
		// sayi1 yazdýðýmýzda hiçbir method çýkmaz cünkü sayi1 int dir yanii primitive data tipidir.
		// sayi2 yazdýðýmýzda bir çok methof geliyor, çünkü sayi2 integer dir yani wrapper classdýr.
		
		
		String tel1 = "35789785";
		String tel2 = "32456894";
		
		System.out.println(tel1+tel2);
		
		// bu sayýlarý toplamak istersek 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
				
	
	}

}
