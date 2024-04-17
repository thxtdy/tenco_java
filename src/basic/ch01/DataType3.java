package basic.ch01;

public class DataType3 {
	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {
		
		// 기본 데이터 타입
		// 참조 타입
		
		// 기본 데이터 타입 - 실수형
		// float, double
		
//		float floatBox1 = 0.5;  <-- 기본 연산 단위가 double 이기에 접미사 f를 붙여줌(float = 4 byte)
		float floatBox1 = 0.5F; //<-- 접미사 대소문자 둘 다 사용 가능.
		float floatBox2 = 0.5f;
		
		double doubleBox1 = 0.1234;
		double doubleBox2 = 1.12345678;
		// double 8byte 크기이다. 실수의 기본 연산 단위이고
		// 그 이유는 소수점을 더 많이 표현할 수 있기 때문에 값의 정확도를 높일 수 있다.
		
		// 콘솔창 결과 출력 - 콘솔창에서는 기본적으로 정확한 데이터 타입을 확인할 수 없다.
		
		System.out.println(floatBox1);
		System.out.println(doubleBox1);
		
		System.out.println(0.5f);
		System.out.println(0.10d); // 기본 연산 단위가 double 이기 때문에 접미사 d를 잘 쓰진 않음.
		
		
	}// end of main

}// end of class
