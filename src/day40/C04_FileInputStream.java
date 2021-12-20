package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_FileInputStream {
	
	public static void main(String[] args) throws IOException  {
		// Javada bir dosyaya ulaşmak istediğimizde FileInputStream class indan yardım alırız.
		
		FileInputStream fis = new FileInputStream("\\src\\day40\\yazi.txt");
		
		
		
		// Java bu kodda olasi bir problem ön görüyor 
		// ve bu probleme karşı ne yapması gerektiğini bize soruyor
		// yani alt çizilen her kod CTE değildir.
		
		// Bunun için 2 durum sözkonusu 
		// 1 - try catch kullanarak bu problemi handle edip javanın yoluna devam etmesini sağlayabiliriz.
		// 2 - Eğer dosya okunamıyorsa kod çalışmasin istiyorsak, olayın farkında oldugumuzu 
		// 	   ve sorumlulugun bizde oldugunu Java'ya söylemeliyiz.
		
		
		System.out.println("Program çalıştı bitti.");
	}

}
