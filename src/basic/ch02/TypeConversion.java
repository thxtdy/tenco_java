package basic.ch02;

/**
 * 형 변환이란?
 * 데이터 타입을 다른 데이터 타입으로 변환 하는 것
 * 자동 형변환, 강제 형변환으로 나뉨
 */

public class TypeConversion {
    // 코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox = 100; // 4byte
		double doubleDataBox; // 8byte
		
		doubleDataBox = intDataBox;// 작은 상자에서 큰 상자로 들어가는 개념.
		     //8byte <- 4byte
		System.out.println(doubleDataBox);
		// 자동 형 변환이다.
		
		System.out.println("-----------");
		
		// 그럼 강제 형 변환이란
		final double PI = 3.14159;
//		int intBox = PI; // 컴파일러가 작은 상자에 큰 상자를 값을 넣을 수 없다고 알려줌
		// 컴파일러한테 강제로 넣게 할 수 있음.
		int intBox = (int)PI;
		System.out.println(intBox);
		// 결과값이 3.14159 인데 int 속성으로 출력을 하니 소수점이 잘려나감.

		
		// 연습
		double interestRate;
		int discount;
		
		interestRate = 15.5;
		discount = (int)interestRate;
		System.out.println(discount);
		
//		System.out.println(//식을 작성할 수 있음);
		
		System.out.println((int)7.8);  // <-- 프린트 식 안에서 강제로 변환 가능.
		
		
		
	} // end of main

} // end of class
