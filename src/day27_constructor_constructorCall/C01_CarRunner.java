package day27_constructor_constructorCall;

public class C01_CarRunner {

	public static void main(String[] args) {
		// Dünkü Car Class'indan bir obje oluşturalım
		// Java Car class ini icinde bulundugumuz class a import etmek ister
		
		Car1 car1 = new Car1();
		System.out.println(car1.yil);
		
		
		
		Car1 car2 = new Car1();
		System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " "+ car1.yil); // 0 null null 2000

		car1.km=75000;
		car1.model="Corolla";
		car1.renk="Kirmizi";
		System.out.println(car1.km + " " + car1.model+ " " + car1.renk + " "+ car1.yil); // 75000 Corolla Kirmizi 2000
		
		Car1 car3 = new Car1();
		System.out.println(car3.km + " " + car3.model+ " " + car3.renk + " "+ car3.yil);
		
		Car1 car4 = new Car1();
		car4.km=4000;
		car4.satilikMi=true;
		System.out.println(car4.km + " " + car4.model+ " " + car4.renk + " "+ car4.yil + car4.satilikMi);

		
		


	}

}
