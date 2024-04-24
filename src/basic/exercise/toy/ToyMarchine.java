package basic.exercise.toy;

import java.util.Scanner;

// 클래스 인형 뽑기 설계
// 상품들이 존재
// 사자인형, 곰인형, 에어팟
// 배열을 활용
public class ToyMarchine {

	private Product[] products;

//	final int ONE_TRY = 1;
//	final int FIVE_TRY = 2;
//	final int TEN_TRY = 3;

	public void random() {
		Scanner sc = new Scanner(System.in);
		Airpods airpods = new Airpods("콩나물", 1);
		Beardoll bear = new Beardoll("볼리베어", 2);
		Liondoll lion = new Liondoll("사자짱짱킹", 3);

		System.out.println("123");
		
		int chooseNum = sc.nextInt();
		int turnNum = 0;

		if (chooseNum == 1) {
			turnNum = 1;
		} else if (chooseNum == 2) {
			turnNum = 5;
		} else if (chooseNum == 3) {
			turnNum = 10;
		}

		products = new Product[turnNum];

		for (int i = 0; i < turnNum; i++) {
			int randomValue = (int) (Math.random() * 3) + 1;

			if (randomValue == airpods.getNum()) {
				products[i] = new Airpods("콩나물", 1);
			} else if (randomValue == bear.getNum()) {
				products[i] = new Beardoll("볼리베어", 2);
			} else if (randomValue == lion.getNum()) {
				products[i] = new Liondoll("사자짱짱킹", 3);
			}

			
			
			System.out.println("00");
//			if (chooseNum == 1) {
//				int intValue = (int) (randomValue * 7) + 1;
//				if (products[0].getNum() == intValue) {
//					System.out.println("콩나물 당첨.");
//				} else if (products[1].getNum() == intValue) {
//					System.out.println("볼리베어 당첨");
//				} else if (products[2].getNum() == intValue) {
//					System.out.println("슈퍼이끌리는 사자킹 당첨");
//				} else {
//					System.out.println("미끌미끌 꽝꽝");
//				}
//			} else if (chooseNum == 2) {
//				int intValue = (int) (randomValue * 10) + 1;
//				if (products[0].getNum() == intValue) {
//					System.out.println("콩나물 당첨.");
//				} else if (products[1].getNum() == intValue) {
//					System.out.println("볼리베어 당첨");
//				} else if (products[2].getNum() == intValue) {
//					System.out.println("슈퍼이끌리는 사자킹 당첨");
//				} else {
//					System.out.println("미끌미끌 꽝꽝");
//				}
//
//			} else if (chooseNum == 3) {
//				int intValue = (int) (randomValue * 13) + 1;
//				if (products[0].getNum() == intValue) {
//					System.out.println("콩나물 당첨.");
//				} else if (products[1].getNum() == intValue) {
//					System.out.println("볼리베어 당첨");
//				} else if (products[2].getNum() == intValue) {
//					System.out.println("슈퍼이끌리는 사자킹 당첨");
//				} else {
//					System.out.println("미끌미끌 꽝꽝");
//				}
//			}

		}

		for (int i = 0; i < turnNum; i++) {
			
			if(products[i] instanceof Airpods) {
				System.out.println("콩나물 당첨.");
			} else if (products[i] instanceof Beardoll) {
				System.out.println("볼리베어 당첨");
			} else if (products[i] instanceof Liondoll) {
				System.out.println("슈퍼이끌리는 사자킹 당첨");
			} else {
				System.out.println("머고");
			}
		}
		
	}

}