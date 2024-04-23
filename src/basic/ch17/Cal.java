package basic.ch17;

public class Cal {

	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}
	
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드입니다.");
		return n1 * n2;
	}

	// Code Test
	public static void main(String[] args) {

		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiply(10, 0));

	} // end of main

} // end of class

class Cal2 extends Cal {
	
	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	}
	
	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의한다 --> 자식 클래스에서 선언된 method 가 부모 클래스의 method를 덮어쓴다.
	// 오버라이드 처리한다.
//	public int multiply(int n1, int n2) {
//		// a or b --> 논리 연산자 --> 논리 합 --> 둘 중 하나라도 true 라면 --> true 이다 = ||
//		// a and b -- > 논리 연산자 --> 논리 곱 --> 둘 중 모두 true 라면 --> true 이다 = &&
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하지 마세요");
//		}
//		
//		return n1 * n2;
//	}
	
	@Override // <-- 애노테이션, 어노테이션 --> 주석 + 힌트
	public int multiply(int n1, int n2) {
		System.out.println("1. 호출");
		return super.multiply(n1, n2); // super = 부모 클래스를 의미하는것.
	}
}