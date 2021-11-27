package day26_ForEachLoop_Constructor;

public class Car {
	
	// Java biz bir class oluşturduğumuzda o classdan obje ureteceğimizi bilir ve her class a default 
	// bir constructor yerleştirir. Javanın class a koyduğu bu default constuctor görülmez ama 
	// obje uretmek uzere kod yazdığımızda otomatik olarak devreye girer.
	
	// Bir contructor oluşturmak çok kolaydir, 
	// methoda benzer ama methoddan farklıdır.
	// 1- Constructor ismi class ismi ile aynı olmalıdır.
	// class isimleri buyuk harfle basladığı için Constructor ismi de buyuk harfle baslar
	// (method'dan 1. farkı budur, methodlar kucuk harfle baslar)
	// Constructorlarin return type i olmaz.
	// (method'dan 2. farkı budur, methodların mutlaka return type'i olmalıdır.)
	

	
	public Car() {
		
	}
	
	// Javanın her class da olusturduğu constructor budur.
	
	
	 int yil = 2000;
	 String renk;
	 String model;
	 int km;
	 boolean satilikMi;
	

}
