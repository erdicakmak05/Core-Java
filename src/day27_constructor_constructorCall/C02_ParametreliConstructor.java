package day27_constructor_constructorCall;

public class C02_ParametreliConstructor {

	public static void main(String[] args) {
		// Javanin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje için yeniden deger ataması yapmak uzun oluyor istersek parametreli constructor lar olusturup,
		// edaha obje olustururken istediğim özellikleri atayabilirim.
		
		Car1 car1 = new Car1(50000, "Doğan SLX","Kırmızı",1993, true);
		
		Car1 car2 = new Car1(35000);
		System.out.println(car2.km);
		
		
		

	}

}
