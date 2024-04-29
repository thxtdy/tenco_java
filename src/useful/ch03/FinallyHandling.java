package useful.ch03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {
	// 메인 쓰레드
	public static void main(String[] args) {
		
		// try - catch - finally
		// 언제 finally 를 사용해야 할까?
		// 자원을 반드시 닫아주어야 할때 등등...
		Scanner sc = new Scanner(System.in);
		
		try {
			int result = sc.nextInt();
			System.out.println("result");
			// scanner 의 자원을 다 사용했다면, 자원을 해제해야 된다.
		} finally {
			sc.close();
			System.out.println("자원 해제 완료");
		}
		
		InputMismatchException i1;
		
		
	} // end of main
} // end of class
