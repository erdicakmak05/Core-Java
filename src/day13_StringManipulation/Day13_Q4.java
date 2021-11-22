package day13_StringManipulation;

import java.util.Scanner;

public class Day13_Q4 {

	public static void main(String[] args) {

		//Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfli bir kelime girin");
		String kelime = scan.next();
		
		
		if (kelime.length()==4) {
			kelime = kelime.substring(3)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1);
			System.out.println(kelime.substring(3)+kelime.substring(2,3)+ kelime.substring(1,2)+kelime.substring(0,1));
		}else {
			System.out.println("4 Harfli kelime girmelisiniz.Hata1");
		}
		
		
		scan.close();
		
		/*if (kelime.length()==4) {
			
			for (int i=kelime.length()-1; i<kelime.length()-1;i--) {
				System.out.print(kelime.charAt(i));
			}
			
			
			
		} else {
			System.out.println("4 Harfli bir kelime girmeliydiniz.");
		}*/
	}

}
