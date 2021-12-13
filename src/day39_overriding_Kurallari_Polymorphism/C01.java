package day39_overriding_Kurallari_Polymorphism;

public class C01 {
	
	public static void staticMethod() {
		System.out.println("Parent class static method calisti.");
	}
	
	private void privateMethod() {
		System.out.println("Parent class private method çalıştı.");
	}
	// final demek son hali oldugunu belirtir , değiştirilemez.
	// overriddi edilemez.
	public final void finalMethod() {
		System.out.println("Parent class final method çalıştı.");
	}
	// Child class ile parent class ayni package da olduklarından
	// methodların access modifier lari public protected veya default olsaydı 
	//
}
