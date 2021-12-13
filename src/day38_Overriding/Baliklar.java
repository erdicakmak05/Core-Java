package day38_Overriding;

public class Baliklar extends Animals{

	public static void main(String[] args) {
		
		Baliklar balik1 = new Baliklar();
		balik1.beslenme(); // Tüm hayvanlar beslenir.
		balik1.hareket();  // Balıklar yüzerek hareket eder.
		balik1.solunum();  // Balıklar solungaçlarıyla nefes alır.

	}
	@Override
	// Childe classdaki bir metod parent classdan bir metodu override ediyorsa yani geçersiz
	// kılıyorrsa bunu istersek @Override notasyonu ile deklare edebiliriz.
	// Ancak declare ettiğimizde Java overridden olan metodu sürekli kontrol eder.
	// ve o methodda bir değişiklik olursa cte verir.
	public void hareket() {
		System.out.println("Balıklar yüzerek hareket eder.");
	}
	

	public void solunum() {
		System.out.println("Balıklar solungaçlarıyla nefes alır.");
	}

}
