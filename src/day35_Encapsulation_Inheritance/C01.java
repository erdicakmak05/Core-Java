package day35_Encapsulation_Inheritance;

public class C01 {
	
	private double not = 49.9;
	
	private boolean gecerMi=false;
	
	

	public void setNot(double not) {
		this.not = not;
	}




	public boolean isGecerMi() {
		
		if (not>=50) {
			gecerMi=true;
		}
		
		return gecerMi;
	}




	public static void main(String[] args) {
		
	}

}
