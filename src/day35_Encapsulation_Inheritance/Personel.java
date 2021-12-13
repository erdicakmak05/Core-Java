package day35_Encapsulation_Inheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
	public Personel(){
		System.out.println("Personel parametresiz controctur çalıştı.");
	}
	
	// eğer variablara access modifier yazmazsak 
	// Java acces modifie olarak default acc.mod atar.
	// boyle olursa sadece o packace altındaki child classlar 
	// Personel class ini inherit edebilir.
	// Baska package lardaki child classlarında Personeli ingeri edebilmesi icin 
	// variable ve methoların acc mod larini protected yaparız
	// Public yapsak da inherit edebilir ama biz herkesin erismesini değil de 
	// sadece child classların erişmesini istediğimizden proteced'i terchi ederiz.
	
	public static void main(String[] args) {
		
	}

}
