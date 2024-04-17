package basic.ch08;

public class StudentMainTest {

	public static void main(String[] args) {
		//Student.ch08 의 구조에 맞게 강제로 맞춰야 함.
		Student s1 = new Student("홍길동", 101, 3); // 객체
		System.out.println(s1); // 주소값이 출력된다.
		s1.showInfo();
		
		Student s2 = new Student("유재성", 102, 4);
		System.out.println(s2);
		s2.showInfo();
		
		// 변수에 직접 접근해서 값을 초기화 해보세요.
		Student s3 = new Student();
		s3.name = "다다";
		s3.grade = 3;
		s3.number = 3;
		System.out.println(s3);
		s3.showInfo();
		
		// 생성자를 여러 개 만들어줄 수 있다.
		// 생성자 오버로딩이라고 한다.
		
	}// end of main

}// end of class
