package basic.ch02;

public class constant {
	
/**
 * 컴파일 시점 --> .class 파일을 만들어 내는 과정 (javac 명령어 동작)
 * 런타임 시점 --> Ctrl + F11 프로그램 실행 ~~~~~~~~~ 실행 종료까지
 * 
 * 
 * Java 명령어는 프로그램을 실행 시키는 명령어이다.
 * Javac 명령어는 번역하는 과정이다.
 * 
 * 자바 언어로 코드를 작성하고 있습니다.
 * JDK (Java Development Kits) 를 설치해야 자바 프로그래밍 가능 -> 도구들이 존재
 * JDK --> JRE(자바 프로그램 실행 환경이라고 한다.)
 * JRE --> JVM(자바 가상 머신) 
 * JVM 은 .clss 파일을 실행 시켜주는 녀석이다.
 * JVM 은 어떤 연산을 거쳐 이진 코드(바이너리 파일로 변환시켜서 수행하는 녀석이다.)
 */
	
	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {
		
		// 상수 선언 --> 값이 한번 정해지면 변경할 수 없는 수(값, 데이터)
		final int MAX_NUM = 10;
		final int MIN_NUM;
		MIN_NUM = 0; // 초기화
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 100; 컴파일 오류 발생
//		Ctrl + s 누르면 IDE 툴이 javac Constant.java 명령어를 수행한다.
//		명령어의 결과로 Constant.clss 파일이 생성된다.
//		Why? JVM이 이해할 수 있는 언어이기 때문에 번역을 해주어야 한다.
		
		System.out.println("-----------------");
		// 원주율 상수로 선언
		final double PI = 3.14159;
		// 원의 반지름을 상수로 선언하자.
		final int RADIUS = 10;
		
		// 원의 둘레 계산 
		System.out.println(2 * PI * RADIUS);
		
		// 원의 넓이 계산
		System.out.println(RADIUS * RADIUS * PI);
		
		System.out.println("저장 안했는데 나");
		
		
		
	} // end of main

} // end of class
