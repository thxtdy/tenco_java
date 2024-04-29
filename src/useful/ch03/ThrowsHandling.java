package useful.ch03;

public class ThrowsHandling {
	
	// 메인 쓰레드
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		try {
			// 던져서 강제성이 발생이되고
			// 사용하는 사람이 직접 예외 처리 핸들링을 할 수 있다.
			calc.divide(10, 0);
		} catch (ArithmeticException e) {										// 앞에는 작은 예외처리를 넣고 뒤에는 큰 예외 처리를 넣어줌.
			System.out.println("어떤 수를 0으로 나눌 수 없음.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		Exception exception;
		
	} // end of main

} // end of class

class Calc{
	
	public int divide (int n1 , int n2) throws Exception {
		// 사용자가 0을 입력하면 예외가 발생 가능하다.
		// 해결 방법.
		// 1. 해당 메서드에서 직접 예외 처리를 구현.
		// 2. 사용하는 사람이 직접 예외 처리를 할 수 있도록 던져버린다?
		return n1 / n2;
	}
	
}
