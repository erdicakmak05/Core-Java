package day32_Varargs_StringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {

		String str = "Ali Can";
		
		String str2 = new String("Veli Cem");
		
		StringBuilder sb = new StringBuilder("Yaşasın Java");
		
		sb.append("! ! !");
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
	}

}
