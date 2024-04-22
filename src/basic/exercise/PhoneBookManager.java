package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager {

	static int MaximumUsers = 100;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PhoneBook[] phonebook = new PhoneBook[100];

		phonebook[0] = new PhoneBook("박태현", "01074418574");
		phonebook[1] = new PhoneBook("박태환", "01039383230");
		phonebook[2] = new PhoneBook("박태흰", "01012908384");
		MaximumUsers = 5;

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String UPDATE = "3";
		final String DELETE = "4";
		final String SEARCH_SELECT = "5";
		final String END = "0";

		boolean flag = true;

		while (flag) {

			System.out.println("어떤 작업을 수행하시겠습니까?");
			System.out.println("1.저장 // 2.전체 검색 // 3.번호 수정 // 4. 삭제 // 5.선택 검색 ");
			String selectNum = sc.nextLine();

			if (selectNum.equals(SAVE)) {
				save(sc, phonebook);

			} else if (selectNum.equals(SEARCH_ALL)) {
				System.out.println("전체 검색을 실행합니다");
				searchAll(phonebook);

			} else if (selectNum.equals(UPDATE)) {
				System.out.println("------수정------");
				updateNum(sc, phonebook);

			} else if (selectNum.equals(DELETE)) {
				System.out.println("연락처가 삭제되었습니다.");

			} else if (selectNum.equals(SEARCH_SELECT)) {
				System.out.println("해당 번호를 검색합니다.");

			} else if (selectNum.equals(END)) {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
			}
		}

	} // end of main

	public static void save(Scanner sc, PhoneBook[] phoneBook) {
		System.out.println("이 번호를 저장할 이름을 입력해주세요.");
		String name = sc.nextLine();
		String num = sc.nextLine();

		PhoneBook phonebook = new PhoneBook(name, num);

		MaximumUsers++;

		if (MaximumUsers >= phoneBook.length) {
			System.out.println("저장 공간이 부족합니다");
			return;
		}
		System.out.println("저장되었습니다.");
		System.out.println("---------------");
		System.out.println("전화번호를 입력하세요.");

	}

	public static void searchAll(PhoneBook[] phoneBook) {
		System.out.println("------전체 검색 목록------");

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i] != null) {
				System.out.println(phoneBook[i].getName() + ": " + phoneBook[i].getPhonenumber());
			}
		}

	}

	public static void updateNum(Scanner sc, PhoneBook[] phoneBook) {
		System.out.println("수정하실 연락처의 이름을 선택해주세요.");

		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i] != null)
				System.out.println(phoneBook[i].getName() + ": " + phoneBook[i].getPhonenumber());

		}

		String name = sc.nextLine();
		
		for ( int j = 0; j < phoneBook.length; j++) {
			if(phoneBook[j].getName().equals(phoneBook)) {
				System.out.println("변경사항을 입력하세요.");
				
			}
			
		}

	}

} // end of class
