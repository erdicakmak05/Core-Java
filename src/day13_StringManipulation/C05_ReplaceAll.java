package day13_StringManipulation;

public class C05_ReplaceAll {

	public static void main(String[] args) {

		String cumle = "Java     çok     zevkli";
		
		cumle = cumle.replaceAll("\\s+", " ");
		
		System.out.println(cumle);
		
		cumle = cumle.replaceAll("[a-k]", " ");
		
		System.out.println(cumle);
		
		System.out.println(cumle.replaceAll("\\S", "*"));
	}

}
