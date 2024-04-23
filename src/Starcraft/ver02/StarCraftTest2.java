package Starcraft.ver02;
//while , do while
//while --> 조건식을 확인하고 코드를 수행하는 친구
//do while --> 무조건 한번은 수행을 하고 다시 조건을 확인하는 친구

import java.util.Scanner;

public class StarCraftTest2 {

	public static void main(String[] args) {

		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 0;
		
		GateWay gateway1 = new GateWay(1);
		GateWay gateway2 = new GateWay(1);
		
		Zealot z1 = gateway1.createZealot("질럿1");
		Zealot z2 = gateway1.createZealot("질럿2");
		System.out.println(gateway1.getGateWayNumber() + " : " +gateway1.getCount());
		System.out.println(gateway2.getGateWayNumber() + " : " +gateway2.getCount());
		System.out.println("---------------------------------");

		Zergling zg1 = new Zergling("유재성");

		Marine m1 = new Marine("정민제");
		

		Scanner scan = new Scanner(System.in);
		int unitChoice =-1;
		
		do {
		
		System.out.println("유닛을 선택하세요!");
		System.out.println("1. 질럿(용)\t 2. 마린(민)\t 3.저글링(밍)\t 0.게임 종료");

		unitChoice = scan.nextInt();
		System.out.println(unitChoice + "를 선택하셨습니다!");
			if (unitChoice == ZEALOT) {
				
			} else if (unitChoice == MARINE) {
				
			} else if (unitChoice == ZERGLING) {
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				unitChoice = GAME_END;
			}
		
			// 반복 수행 구문
		}while(unitChoice == GAME_END);
		
		
			
		
		
	}
}
