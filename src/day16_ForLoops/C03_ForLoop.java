package day16_ForLoops;

public class C03_ForLoop {

	public static void main(String[] args) {

		//10 ile 30 arasindaki sayilari aralarinda virgule olarak ayni satirda yazdirin
		
		for (int i = 10; i <= 30; i++) {
			if (i==30) {
				System.out.println(i);
			} else {
				System.out.print(i+",");
			}
		}
		for (int i = 10; i <= 29; i++) {
			System.out.print(i + ",");
		}
		System.out.println(30);
		
		
		
		
	}

}
