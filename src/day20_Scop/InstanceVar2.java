package day20_Scop;

public class InstanceVar2 {
	
	String adres = "Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinliMi;

	public static void main(String[] args) {
		// instance variabla lara main methodlara direk ulaşılabilir mi ? // HAYIR
		//	Nasıl ulaşılabilir ? OBJE OLUŞTURARAK
		
		InstanceVar2 ali = new InstanceVar2();
		
		System.out.println(ali.adres); // Ankara
		System.out.println(ali.dogumYeri);
		System.out.println(ali.notOrtalamasi);
		System.out.println(ali.yasOrt);
		System.out.println(ali.cinsiyet);
		System.out.println(ali.ogrenciMi);
		System.out.println(ali.izinliMi);
	}
	
    public static void staticMethod() {
        // instance variable'lara static method'dan direk ulasilabilir mi ? HAYIR
        // nasil ulasilabilir ? OBJE OLUSTURARAK
        
    }
    
    public void staticOlmayanMethod() {
        // instance variable'lara static olmayan method'dan direk ulasilabilir mi ? EVET
    }

}
