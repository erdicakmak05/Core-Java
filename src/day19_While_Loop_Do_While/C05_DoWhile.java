package day19_While_Loop_Do_While;

public class C05_DoWhile {

	public static void main(String[] args) {
		// Soru 2 ) âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.
		
		char a = 'm';
		char b = 'c';
		
		do {
			System.out.print(a+" ");
			a--;
		}while(a>=b);
	}

}
