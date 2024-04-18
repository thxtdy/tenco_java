package basic.ch03;

/**
 * 논리 연산자
 * 관계 연산자와 혼합하여 많이 사용된다.
 * 연산에 결과는 true, false 로 반환된다.
 */

public class Operation6 {

	public static void main(String[] args) {
		
		// 논리 연산자는 3가지 종류가 있다.
		// 논리곱 ---> && (엠퍼센트)로 표현된다.
		// 논리합 ---> || (버티컬 바)로 표현된다.
		// 부정   ---> !  (느낌표) 로 표현된다.
		
		int num1 = 10;
		int num2 = 20;
		
		// 1. 논리곱(&&)
		//                   T      &&     T 
		// 논리곱은 전부 true 이면 true 반환한다. 하나라도 거짓이면 false 반환한다.
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println("flag 1 : " + flag1);
		
		//                   T      &&      F
		boolean flag2 = (num1 > 0 ) && (num2 < 0);
		System.out.println("flag 2 : " + flag2);
		
		System.out.println("============");
		
		// 2. 논리합(||)
		// 둘 중 하나라도 true 이면 연산 결과는 무조건 true 이다.
		//                   T              F
		boolean flag3 = (num1 > 0 ) || (num2 < 0);
		System.out.println("flag 3 : " + flag3);
		
		//3. 부정(!)
          System.out.println("부정 논리 연산자 사용 :" + !flag3);
          // 연산의 결과를 모를때 ---> 확인해야지 ---> 로깅한다.
          System.out.println("flag3 : " + flag3);
          // 부정 연산자는 작성된 코드만 부정을 할뿐, 코드 자체의 속성이 바뀌진 않음.
		
		
		
		
		

	}
}