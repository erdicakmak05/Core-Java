package day10_Ternary_SwitchCase;

public class C07_Switch_Case {

	public static void main(String[] args) {

		//gun numarasýna göre gün ismlerini yazdýralým
		
		int gunNo = 2;
		
		switch(gunNo) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Geçersiz deðer girdiniz.");
			
		}
	}

}
