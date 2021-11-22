package day20_Scop;

public class InstanceVar {
	
	int notMat = 50;
	int notFen;
	// instance variablarin scope unda main method yoktur.
	
	public static void main(String[] args) {

	//System.out.println(notMat); // main method static olduğu için static olmayan variable lar 
								  // main method'da direk kullanılamaz veya görüntülenemez.
		
	//Instance variablalara main methoddan ulaşmaz istersek obje oluşturup obje üzerinden erişim sağlıyabiliriz.
	// Scanner scan = new Scanner(System.in);
		InstanceVar kadir = new InstanceVar();
		System.out.println(kadir.notMat); // 50
		
		InstanceVar nihal = new InstanceVar();
		
		nihal.notMat = 70 ;
		
		System.out.println(nihal.notMat); // 70
		
		// Instance variablerda değer atamazsak java instance oalrak atanan değeri alır.
		// bu class için notMat = 50  gibi
		// ama istersek değerde atayabiliriz, bu durumda değer atadığımız obje için yeni değer geçerli olur.
		
		System.out.println(kadir.notMat); // 50
		
		// kadirin notunu değiştirmek istiyorsak kadir.notMat ' a değer atamalıyız.
		
		kadir.notMat = 90;
		System.out.println(kadir.notMat); // 90
		
		kadir.method2(); // method2 static olmadığı için main methoddan direk çağrılamaz.
		
	}
	
	public static void staticMethod() {
		//System.out.println(notFen); // Instance variable lara static methodlardan direk ulaşılmaz.
	}
	
	public void method2() {
		
		System.out.println("Method 2 dek notFen->"+notFen); // Bu method static olmadığı için instance variablara ulaşabilir.
		
		//Instance variable oluşturulurken değer atanmasada olur.
		//Bu durumda java default değerler atar
		//int içindefault değer 0 dır.
		notFen = 100; 
		
		System.out.println("Method 2 dek notFen->"+notFen);
		
	}

}
