package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {
	public static void main(String[] args) {
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요.");
		
		int maxNumber = sc.nextInt();
		// 1 <--        10 -> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 반복적인 패턴
		//1 2 3 4 5 6 7 8 9 10
		for(int i = 0; i <= maxNumber; i += 2) {
			sum = sum + i;
		
		}
		
		System.out.println("sum : " + sum);
	}

}
