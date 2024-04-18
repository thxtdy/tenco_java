package basic.ch03;

import java.util.Scanner;
// import : 수입하다, 가지고 오다.
/**
 * 
 * 삼항 연산자 (조건 연산자)
 * int num = 조건식 ? 결과1 : 결과2
 * 
 */
public class Operationprac8 {
	public static void main(String[] args) {
		
		System.out.println("두 개의 수 중에 가장 작은 수를 출력하시오.");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = x<y ? x : y;
		System.out.println(result);
		
	} // end of main

} // end of class
