package day46_Collections;

import java.util.HashSet;
import java.util.Set;

public class C02_RetainAll {

	public static void main(String[] args) {
		
		Set<String> lhs1 = new HashSet<>();
		
		
		lhs1.add("Ali");
		lhs1.add("Mehmet Ali");
		lhs1.add("Hasan");
		lhs1.add("Kutlu");
		
		Set<String> lhs2 = new HashSet<>();
		
		lhs2.add("Ali");
		lhs2.add("Mehmet Ali");
		
		System.out.println(lhs1.retainAll(lhs2));
		
		System.out.println(lhs1);
		System.out.println(lhs2);


	}

}
