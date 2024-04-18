package basic.ch03;

/**
 * 관계,비교 연산자
 * 연산의 결과 값이 무조건 ture, false로 반환된다.
 * 
 */

public class Operation5 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
		// 관계 연산자를 주어로 바라본다.
		boolean value = (num1 > num2); // 괄호는 가독성 또는 연산의 우선 순위를 위해)
		System.out.println(value);
		
		System.out.println(3 < 5);
		System.out.println(3 >= 10);
		System.out.println(3 <= 3);
		System.out.println(3 == 5);
		System.out.println(3 != 2);
		
		System.out.println("---------------");
//		                    5        3    주석으로 선언한 변수들 써주기
		System.out.println(num1 < num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

	}
}