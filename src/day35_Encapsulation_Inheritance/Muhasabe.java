package day35_Encapsulation_Inheritance;

public class Muhasabe extends Personel{

	protected  int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasabe (){
		System.out.println("Muhasebe paramtresiz controctor çalıştı.");
	}

	public static void main(String[] args) {
		
		Muhasabe calisan1 = new Muhasabe();
		
		calisan1.isim="Ali";
		System.out.println(calisan1.soyisim); //null
	}

	public int maasHesaplama() {
		int maas = 8 * 25 * saatUcreti;
		return maas;
	}

}
