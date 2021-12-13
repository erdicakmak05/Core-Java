package day38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {

		KumesHayvanlari kms1 = new KumesHayvanlari();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		
		Kuslar kms2 = new KumesHayvanlari();
		kms2.beslenme(); // Tüm hayvanlar beslenir.
		kms2.hareket();	 // Kumes hayvanlari yürüyerek hareket eder.+++++++++++++++++++ Neden kuşlardan almadı ?
		kms2.solunum();	 // Kuşlar nefes alır.
		// kendi  spesifik özellikleri dışında kuşlara tabi oluyor
		// ama spesifik bir durumu varsa farkını ortaya koyuyor.
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme(); // Tüm hayvanlar beslenir.
		kms3.hareket();	 // Kuşlar uçarak hareket eder.
		kms3.solunum();	 // Kuşlar nefes alır.
		
		Animals kms4 = new KumesHayvanlari();
		
		kms4.beslenme();//Animals
		kms4.hareket();	//Animals +++++++++++ Cosntructor KumesHayvani ve Override edildiği için spesifik özelliği buradan aldı.
		kms4.solunum(); //Animals
	}

	public void hareket() {
		System.out.println("Kumes hayvanlari yürüyerek hareket eder.");
	}
	


}
