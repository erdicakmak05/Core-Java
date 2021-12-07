package day33_StringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); 
		
		System.out.println(sb.subSequence(14, 19));
		
		System.out.println(sb);
		
		// ikiside aynı sonucu döndürür.
		// ancak substring() String class inden geldiği için
		// substring() kullandıgımda arkasından String methodlarını kullanabilirim.
		// Ancak, subSequence kullandıgımda bu mumkun olmaz.
		
		// toString --> Stringe çevirir.
		
		// trimToSize() --> Stringbuilderin capacity ile lenght ini eşitler.
		
		
	}

}
