package day36_Inheritence;

import day35_Encapsulation_Inheritance.Muhasabe;

public class Memur extends Muhasabe {
	
	public Memur() {
		System.out.println("Memur constructor çalıştı");
	}

	public static void main(String[] args) {

		Memur memur1 = new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesaplama();
		System.out.println(memur1.isim+ " in maasi : " + memur1.maas);
	}

}
