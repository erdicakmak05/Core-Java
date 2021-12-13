package day39_overriding_Kurallari_Polymorphism;

public class C02 extends C01{

	public static void main(String[] args) {
		
		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2 = new C02();
		//obj2.privateMethod();
		// data türü C01 oldugundan öncelikle C01 classindaki 
		// method'a bakmamız gerekir ancak private oldgundan ulaşamayız.
		
		obj2.staticMethod();
	}
	
	public static void staticMethod() {
		System.out.println("Child class static method calisti.");
	}
	
	private void privateMethod() {
		System.out.println("Child class private method çalıştı.");
	}
	
	/*
	public final void finalMethod() {
		System.out.println("Parent class final method çalıştı.");
	}*/

}
