package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Gün isimlerinden birinin ilk harfini yazýnýz...");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		
		if (ilkHarf == 'P') {
			System.out.println("Pazar Pazartei Perþembe");
		}
		if (ilkHarf== 'S') {
			System.out.println("Salý");
		}
		if (ilkHarf== 'C') {
			System.out.println("Carþamba , Cuma , Cumartesi");
		}else  {
			System.out.println("Geçersiz iþlem");
		}
		
	}

}
