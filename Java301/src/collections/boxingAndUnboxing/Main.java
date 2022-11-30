package collections.boxingAndUnboxing;

public class Main {

	public static void main(String[] args) {
		int i = 10;
		passInteger(i); //otomatik olarak arka planda Integer a dönüştürülür
		int pass = passInteger(i);
		
		Double d = 10.0;
		double x = d; 
		
		Integer integer = 10;
		 
	}
	
	public static int passInteger(Integer integer) {
		return integer.intValue();
	}

}
