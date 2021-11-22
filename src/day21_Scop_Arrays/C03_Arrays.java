package day21_Scop_Arrays;

public class C03_Arrays {

	public static void main(String[] args) {

		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan bir array olusturun ve bu

		// 		   array’i yazdirin.

		String arr[] = new String[4];
		arr[0]= "Ali";
		arr[1]="Veli";
		arr[2]="Ayşe";
		arr[3]="Fatma";
		
		String arr2[]= {"Ali","Veli","Ayse","Fatma"};
		
		arr2[0]="Can";
		arr2[2]="Gul";
		
		System.out.println(arr2[1]);
		
		// son elementi yazdirin.
		
		System.out.println(arr[arr.length-1]);
		//System.out.println(arr[arr.length]);// yazdığımız index sınırların dışnda
	}

}
