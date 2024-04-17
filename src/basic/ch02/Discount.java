package basic.ch02;

public class Discount {
	
	public static void main(String[] args) {
		
		final double ORIGINAL_PRICE = 59.99;
		final double DISCOUNT_PER = 0.3;
		
		double lastprice = ORIGINAL_PRICE - (ORIGINAL_PRICE * DISCOUNT_PER);
		
		int result = (int)lastprice;
		
		System.out.println(result);
		
	}

}
