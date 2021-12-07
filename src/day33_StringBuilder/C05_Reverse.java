package day33_StringBuilder;

public class C05_Reverse {

	public static void main(String[] args) {
		// verilen bir cümleyi tersten yazdıralım
		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		sb.reverse();
		
		System.out.println(sb);
		
		sb.setCharAt(0, '!');
		
		System.out.println(sb); // 0 ıncı indeksi değiştirdik 
		
		
		

	}

}
