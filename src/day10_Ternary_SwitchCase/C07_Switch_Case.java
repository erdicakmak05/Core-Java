package day10_Ternary_SwitchCase;

public class C07_Switch_Case {

	public static void main(String[] args) {

		//gun numaras�na g�re g�n ismlerini yazd�ral�m
		
		int gunNo = 2;
		
		switch(gunNo) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
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
			System.out.println("Ge�ersiz de�er girdiniz.");
			
		}
	}

}
