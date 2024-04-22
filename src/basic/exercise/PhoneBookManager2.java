package basic.exercise;

import java.util.Scanner;

public class PhoneBookManager2 {

	static int Maximum;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PhoneBook[] phones = new PhoneBook[100];

		phones[0] = new PhoneBook("박태현0", "01074418574");
		phones[1] = new PhoneBook("박태현1", "01074418574");
		phones[2] = new PhoneBook("박태현2", "01074418574");
		Maximum = 3;
		
		final String SAVE = "1";
		final String SEARCH = "2";
		final String UPDATE = "3";
		final String DELETE = "4";
		final String SELECT = "5";
		final String END = "0";
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("수행하실 작업을 선택해주세요.");
			System.out.println("1. 저장 // 2. 전체 검색 // 3. 번호 수정 // 4. 삭제 5. 선택 검색 // 0. 종료");
			
			String selectedNumber = sc.nextLine();
			
			if(selectedNumber.equals(SAVE)) {
				System.out.println("저장하기");
				PhoneBook.Save(sc, phones);
			}else if (selectedNumber.equals(SEARCH)) {
				System.out.println("전체 검색");
				PhoneBook.Search(phones);
			}else if (selectedNumber.equals(UPDATE)) {
				System.out.println("번호 수정");
				PhoneBook.Update(sc, phones);
			}else if (selectedNumber.equals(DELETE)) {
				System.out.println("삭제");
				PhoneBook.Delete(phones);
			}else if (selectedNumber.equals(SELECT)) {
				System.out.println("선택 검색");
				PhoneBook.Select(sc, phones);
			}else if (selectedNumber.equals(END)) {
				System.out.println("종료");
				flag = false;
			}else {
				System.out.println("잘못된 요청입니다.");
			}
			
			
		}
		
		
		
	} // end of main
	
	

} // end of class
