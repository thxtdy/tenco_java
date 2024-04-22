package basic.exercise;

import java.util.Scanner;

public class PhoneBook {

	private String name;
	private String phonenumber;
	// 속성

//	public PhoneBook(String name) {
//		this.name = name;
//	}

	public PhoneBook(String name, String phonenumber) {
		this.name = name;
		this.phonenumber = phonenumber;

	}

	public String getName() {
		return name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void Delete(PhoneBook[] phones) {
		System.out.println("삭제되었습니다.");
		for (int i = 0; i < phones.length; i++) {
			phones[i] = null;
		}
	}

	public static void Save(Scanner sc, PhoneBook[] phones) {
		System.out.println("저장하실 이름을 작성해주세요.");
		String name = sc.nextLine();
		System.out.println("저장하실 번호를 작성해주세요.");
		String num = sc.nextLine();
		PhoneBook call = new PhoneBook(name, num);

		for (int i = 0; i < phones.length; i++) {
			if (phones[i] == null) {
				phones[i] = call;
				System.out.println("완료되었습니다.");
				break;
			}
		}

	}

	public static void Search(PhoneBook[] phones) {
		System.out.println("---전체 검색 목록---");
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {
				System.out.println(phones[i].getName() + ": " + phones[i].getPhonenumber());
			}
		}
	}

	public static void Select(Scanner sc, PhoneBook[] phones) {
		System.out.println("검색하실 이름을 입력하세요.");
		String name = sc.nextLine();

		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {
				if (phones[i].name.equals(name)) {
					System.out.println(phones[i].getName() + ": " + phones[i].getPhonenumber());
					break;
				}

			}

		}
	}
//	System.out.println(phones[i].getName() + ": " + phones[i].getPhonenumber());

	public static void Update(Scanner sc, PhoneBook[] phones) {
		System.out.println("수정하실 정보를 입력해주세요.");
		String info = sc.nextLine();
	
		for (int i = 0; i < phones.length; i++) {
			if (phones[i] != null) {
				if(phones[i].name.equals(info)) {
					String change = sc.nextLine();
				phones[i].setPhonenumber(change);
				}
			}
			
		}

	}
	// 기능

}
