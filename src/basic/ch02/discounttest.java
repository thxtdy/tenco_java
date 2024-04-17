package basic.ch02;

public class discounttest {
	
	public static void main(String[] args) {
		
		final double ORIGINAL_PRICE = 59.99;
		final double DISCOUNT_PER = 0.3;
		
		double lastprice = ORIGINAL_PRICE * (1 - DISCOUNT_PER);
		
		int result = (int)lastprice;
		 
		System.out.println("최종 가격 : " + result);
		System.out.println("최종 가격 : " + lastprice);
		
	}

}
