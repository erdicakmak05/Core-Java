package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildExeptions {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src\\day40\\yazi1");
			System.out.println("görev tamamlandı");
			int k = 0;
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);

			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println("Görev tamamlandı.");

	}

}
