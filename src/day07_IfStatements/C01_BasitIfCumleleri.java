package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("G�n isimlerinden birinin ilk harfini yaz�n�z...");
		char ilkHarf = scan.next().toUpperCase().charAt(0);
		
		
		if (ilkHarf == 'P') {
			System.out.println("Pazar Pazartei Per�embe");
		}
		if (ilkHarf== 'S') {
			System.out.println("Sal�");
		}
		if (ilkHarf== 'C') {
			System.out.println("Car�amba , Cuma , Cumartesi");
		}else  {
			System.out.println("Ge�ersiz i�lem");
		}
		
	}

}
