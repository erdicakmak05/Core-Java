package day27_constructor_constructorCall;

public class Tir {

	public Tir(int i, String string, String string2, int j, boolean b) {
		// Tir Runner classindan yolladıgımız degerlerin instance variablar ile
		// eslesmesi için
		// aramalari yapmak lazım
		km = i;
		model = string;
		renk = string2;
		yil = j;
		satilikMi = b;
	}

	public Tir(int km, String model, String renk) {
		// i, string ve string2 isim olarak uygun durmuyor.
		// kodumuzu sonradan sonradan incelerken anlaşılır değil.
		// daha anlaşılır olması için, variable isimlerini anlamlı yapalım
		
		this.km=km;
		this.model=model;
		this.renk=renk;
		
		// basina this. yazdığımızda java bu variable in class level'daki oldugunu anlar.
		
		
	}

	int yil = 2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;

}
