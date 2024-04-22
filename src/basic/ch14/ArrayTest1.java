package basic.ch14;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입.

		// 배열의 특징 (**중요**)
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3];
		int intBox[] = new int[5];

		// 값 넣기 (초기화)
		// 배열의 길이 = 3;
		// 인덱스의 길이 = 2;
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;

		// numbers[3] = 1003; --> 인덱스의 길이를 벗어났음. = 오류 발생;
		// 사전 기반 지식 = 모든 프로그래밍의 인덱스 번호는 0부터 시작한다.

		// 배열의 선언과 동시에 초기화
		int[] grades = new int[] { 5, 3, 1 };
		int[] grades2 = { 5, 3, 1 }; // new int[] 도 생략 가능하다.

		// 문제 1
		// 5개의 크기를 가지는 double 타입 선언

		double[] doubleBox = new double[5];

		// 문제 2
		// 위에서 선언한 배열의 값을 인덱스 0 ~ 2까지 초기화 하시오.

		doubleBox[0] = 10.0;
		doubleBox[1] = 11.9;
		doubleBox[2] = 12.8;

		// 문제 3
		// String 타입의 배열을 선언, 배열의 크기는 3개
		// 선언과 동시에 초기화

		String[] stringBox = new String[] { "3", "2", "1" };
//		String[] stringBox = { "3", "2", "1" };  <-- 이렇게도 가능하다.

	} // end of main

} // end of class
