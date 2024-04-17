package basic.ch01;

public class DataType1 {
	//코드의 시작점
/**
 * 데이터 타입이란
 * 상자에 들어 갈 수 있는 갑스이 유형과 크기를 지정하는 것
 */
	
	
	public static void main(String[] args) {
		
		//데이터 타입의 종류
		// 1. 기본 자료형 (primitive data type)
		// 2. 참조 타입 (Reference type)
		
		// 기본 자료형
		// [정수형, 문자형(문자열 X), 실수형, 논리형 ] 4가지로 구분하자.
		
		// 정수형 - 정수는 소수점 이하를 포함하지 않는 숫자를 의미함.
		// 1,2 ,-5, 100 등은 모두 정수다
		
		byte byteBox;      // 1바이트 -> 네모칸 한칸은 1bit --> 8bit --> 1byte;
		short shortBox;    // 2바이트 -> 16bit -> 2byte
		int intBox;        // 4바이트 -> 32bit -> 4byte
		long longBox;      // 8바이트 -> 64bit -> 8byte
		
		// 위 상자들은 정수값을 담을 수 있는 상자인데 크기가 정해져 있다.
		
		
		
		// byte는 -128 ~ 127 까지 담을 수 있음.
		byteBox = -128;
		byteBox = 127; 
		
		// short 는 `-32768 ~ 32767 까지 담을 수 있음
		shortBox = -32768;
		shortBox = 32767; 
		
		// 약 + - 2억까지 사용 가능하다.
		intBox = -2147483648;
		intBox = 21473647; 
		
		// 약 경까지
		longBox = -9223372036854775808L; //숫자 마지막에 L은 접미사라고 합니다.  
		longBox = 9223372036854775807L;  // 기본 연산값인 int 값이 아니라 long 값이라고 표시 용도이다.                                                                
		
		// L value = R value
		// 보통 오른쪽 기술 되는 수의 기본 단위는 4바이트 크기인 int 형으로 먼저 계산합니다.
		// 정수형에 기본 연산 단위는 int 형이다.
		
	}//end of main
	

}// end of class
