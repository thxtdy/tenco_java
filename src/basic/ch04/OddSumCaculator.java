package basic.ch04;

import java.util.Scanner;

public class OddSumCaculator {
			public static void main(String[] args) {
				// 사용자의 입력값을 받아서 1부터 x 까지 숫자의 더하고 출력하시오.
				
				Scanner sc = new Scanner(System.in);
				System.out.print("정수값을 입력하세요.");
				
				int number = sc.nextInt();
				int sum = 0;
				for(int i = 1; i <= number; i +=2) {
					//          7, 1 3 5 7   ... sum = 1 3 5 7
				sum +=i;
				
				System.out.print("sum : " + sum + "\n");
					
				}
//				System.out.print("sum : " + sum);
				
			} // end of main
} // end of class
