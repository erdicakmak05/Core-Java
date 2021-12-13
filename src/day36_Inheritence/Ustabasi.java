package day36_Inheritence;

import day35_Encapsulation_Inheritance.Isci;

public class Ustabasi extends Isci {

	Ustabasi() {
		System.out.println("Ustabası parametresiz construcktor calisti.");
	}

	public static void main(String[] args) {
		
		Ustabasi ust1 = new Ustabasi();
		
		Isci m = new Isci();
		
		
		// Java da her class olusturuldugunda default contructor olustugu gibi,
		// child class'da olusturulan her bir constructor'in 
		// Ilk satirinde gizli super() olusturulur.
		
	}

}
