package day33_StringBuilder;

public class C02_Delete {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Java candir can");
		
		sb.deleteCharAt(11);
		
		System.out.println(sb); //Java candircan
		
		sb.delete(11, sb.length());
		
		System.out.println(sb);
		
		sb.delete(5, 40);
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());  // deletede yazdıgımız uzunluk capacity i degistirmiyor.
		
		
		
	}

}
