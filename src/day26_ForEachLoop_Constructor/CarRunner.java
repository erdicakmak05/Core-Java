package day26_ForEachLoop_Constructor;

public class CarRunner {

	public static void main(String[] args) {

		// Car class'indan bir obje oluşturalım 
		
		     Car             car1         =           new           Car();
		
		// class ismi      obje ismi    atama      keyword     Constructor Call  
		
		System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " "+ car1.yil); // 0 null
		
		// Bir obje oluştururken eger obje için kendi class inda belirlenen degerileri kullanmak istiyorsam 
		// hiçbir değeri kendim atamadan obje olusturabilirim.
		// bu durumda hic bir parametre kullanılmadıgı için default constructor yeterli olacaktır
		
		// Eğer obje olusturduguym class'daki degerleri kulanmak yerine kendi degerlerimle bir obje 
		// olusturmak istersem o zaman parametreli constructor olusturmam gerekir.
		
		// Car car2 = new Car("Kirmizi", "Corolla");
		
		// Car class indaki 
	}

}
