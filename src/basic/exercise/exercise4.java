package basic.exercise;

import java.util.Scanner;

public class exercise4 {
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		int choice;
		// \n --> 무조건 한줄 내림
		System.out.println("\n메뉴 선택");
		System.out.println("1.등록 2.조회 3.수정 4.삭제 5.종료");
		System.out.print("선택 : ");
		choice = scan.nextInt();
		
		boolean flag = true;
		
		while(flag) {
			
		
			
		if(choice == 1) {
			
			System.out.println("등록을 선택했습니다.");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			
			choice = scan.nextInt();
			
		}
		else if(choice == 2) {
			System.out.println("조회를 선택했습니다.");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = scan.nextInt();
			
		}	
		else if(choice == 3) {
			System.out.println("수정을 선택했습니다.");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = scan.nextInt();
		}
		else if(choice == 4) {
			System.out.println("삭제를 선택했습니다.");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = scan.nextInt();
		}
		else if(choice == 0) {
			System.out.println("프로그램을 종료합니다.");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = scan.nextInt();
		}
		else {
			System.out.println("잘못된 입력입니다. 다시 선택해주세요.( 1 ~ 5 )");
			System.out.print("\n--------------------");
			System.out.println("\n메뉴 선택");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
			System.out.print("선택 : ");
			choice = scan.nextInt();
		}
		
		}// end of while
		
	}// end of main
		
		
	
	
	
	
	}// end of class

