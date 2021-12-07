package day33_StringBuilder;

public class C04_Insert {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ogrendik");
		
		// araya çok iyi ekliyelim
		
		sb.insert(4, "yı cok iyi");
		
		System.out.println(sb);
		
		//
		
		String str2 = "cok iyiyim";
		
		sb.insert(7,str2,0,4);
		
		System.out.println(sb);
		
	}

}
