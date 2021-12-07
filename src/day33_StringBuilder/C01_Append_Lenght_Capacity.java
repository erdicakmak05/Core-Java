package day33_StringBuilder;

public class C01_Append_Lenght_Capacity {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		sb.length(); // sb'nin uzunlugunu verir.
		
		System.out.println(sb.length());  // sb nin kullanılan kısmının uzunlugunu verir. // 0
		
		sb.capacity();
		
		System.out.println(sb.capacity()); // sb nin kapasitesini verir. sb boş ise 16 verir.
		
		StringBuilder sb2 = new StringBuilder("Java candır.");
		
		System.out.println(sb2.capacity()); // 28 verdi +16 ekledi
		
		StringBuilder sb3 = new StringBuilder(7);
		
		sb3.append("Mehlika");
		
		System.out.println(sb3.length());  // 7
		System.out.println(sb3.capacity()); // 7
		
		
		StringBuilder sb4= new StringBuilder(7);
		
		System.out.println(sb4.length());  // 0
		System.out.println(sb4.capacity()); // 7
		
		sb4.append("Nilgün");
		
		System.out.println(sb4.length());  // 6
		System.out.println(sb4.capacity()); // 7
		
		sb4.append(" candir");
		
		System.out.println(sb4.length());  // 13
		System.out.println(sb4.capacity()); // 16
		
		sb.append("Java");
		System.out.println(sb); // Java
		
		sb.append(" candır");
		
		System.out.println(sb);
		
		sb.append("anlasildi mi", 3, 6);  // metodun içinde ki stringin 3-6 ya kadar olan karakterlerini ekledi.
		
		System.out.println(sb);
		

		
		
	}

}
