package basic.ch04;

import java.util.Scanner;

public class whiletest2 {

	public static void main(String[] args) {

		// 특정 조건일때 반복문을 종료 시켜보자.

		boolean flag = true; // 깃발
		int start = 1;
		int end = 3;

		while (flag) {

			if (start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;

			} // end of if
			System.out.println("start : " + start);

			start++;
		} // end of while

	} // end of main

} // end of class
