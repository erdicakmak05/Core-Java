package day35_Encapsulation_Inheritance;

public class Isci extends Muhasabe {
	
	protected String statu;
	protected String meslegi;
	protected String sendika;
	
	public Isci(){
		System.out.println("İsçi parametresiz contructor çalıştı.");
	}

	public static void main(String[] args) {
	
		Isci isci1 = new Isci();
		
		isci1.meslegi="Kaynakçı";
		isci1.saatUcreti=20;
		isci1.isim="Erman";
		isci1.maas=isci1.maasHesaplama();
		System.out.println(isci1.isim + " in maasi : " + isci1.maas);
		

	}

}
