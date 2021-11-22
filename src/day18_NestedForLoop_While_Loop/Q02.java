package day18_NestedForLoop_While_Loop;

public class Q02 {

	public static void main(String[] args) {
		//For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam

		//bolunebilen sayilari yazdirin.
		
		int i = 100;
		
		while (i>99 && i<1000) {
			if (i%15==0 || i% 20==0 || i%90==0) {
				System.out.println("15, 20 ve 90'dan birine tam bölüne bilen sayılar "+i+ " ");
			}
			i++;

		}
	}

}
