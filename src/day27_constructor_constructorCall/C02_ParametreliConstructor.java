package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Javanin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje için yeniden deger ataması yapmak uzun oluyor istersek parametreli constructor lar olusturup,
		// edaha obje olustururken istediğim özellikleri atayabilirim.
		
		Car1 car1 = new Car1(50000, "Doğan SLX","Kırmızı",1993, true);
		
		Car1 car2 = new Car1(35000);
		System.out.println(car2.km); //35000
		
		Car1 car3 = new Car1();
		System.out.println(car3.km); //0
		
		Car1 car4 = new Car1(1000);
		System.out.println(car4.km); //1000
		
		Car1 car5 = new Car1(2020,5000);
		System.out.println(car5.yil+ " " + car5.km);
		
		
		
		
		
		

	}

}
