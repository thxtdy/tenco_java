package basic.ch07;

public class User {

	String id;
	String password;
	String name;
	String gender;
	int age;

	// 패스워드 체그 기능 만들어보기.
	// 함수는 동사로 시작하는 것이 권장사항
	public boolean checkPassword(String inputPwd) {
		// 만약 나의 멤버 변수에 들어가 있는
		// password 값과 외부에서 넣을 inputPwd 값이
		// 같다면, true 반환 아니면 false 반환
		// == 주소값, 산술식에 사용한다.
		// 문자열(String) 비교는 equals 라는 메서드를 사용한다. *****
		if (password.equals(inputPwd)) {
			return true;
		}
		return false;
	}

	// main 은 독립적인 함수로서 여기서 실행시킬 수 있다.

	public static void main(String[] args) {
		// User 클래스를 인스턴화
		User user1 = new User(); // 메모리에 올라간다. (heap)
		user1.password = "123";

		User user2 = new User();
		user2.password = "555";

		System.out.println("--------------");

		// user1 pwd 를 확인하고 싶다.

		// 1
		Boolean user1Result = user1.checkPassword("333");
		System.out.println("user1 : " + user1Result);
		// 2
		boolean user1Result2 = user1.checkPassword("123");
		System.out.println("user1 second result : " + user1Result2);

		System.out.println("-------------");
		// 참조 변수 user2 기능인 checkPassword 호출해서 결과를 확인
		// --F
		// --T

		// 실행의 흐름을 만드는 방법 연습.
		// if 구문을 활용해서 console 에 비밀번호가 틀렸습니다. 출력

		boolean userResult5 = user1.checkPassword("343");
		{
			if (user1.checkPassword("123")) {
				System.out.println("비밀번호가 일치합니다.");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}

//		boolean user1Result3 = user1.checkPassword("3223");
//		System.out.println("비밀번호가 틀렸습니다." + user1Result3);
//		
//		boolean user1Result4 = user1.checkPassword("555");
//		System.out.println("비밀번호가 일치합니다." + user1Result3);
//		

	}

}// end of class
