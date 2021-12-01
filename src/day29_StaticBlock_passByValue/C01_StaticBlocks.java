package day29_StaticBlock_passByValue;

public class C01_StaticBlocks {
	
	static {
		System.out.println("Static block ne zaman çalışacak");
		System.out.println("Static bloc main methoddan bile önce çalışır.");
		
		int i = 5;
	}

	public static void main(String[] args) {
		System.out.println("Javada önce main metod çalışır.");
	
	}
	static {
		System.out.println("Static block nereye yazılırsa yazılsın main methoddan once çalışır");
	}

}
	// eğer birden fazla static blok varsa java yukarıdan aşağıya doğru öncelik verir.(staticler içerisinde)