package day40;

public class C01_Exeption {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		
		
				
		try {
			System.out.println("sayilarin bölümü : " + a/b);
		}catch (ArithmeticException e) {
			System.out.println("Sıfıra bölüm yapılamaz.");
			e.printStackTrace();
			
		}
		
		System.out.println("Görev tamamlandı.");

	}

}
