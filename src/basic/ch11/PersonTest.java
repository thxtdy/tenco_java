package basic.ch11;

public class PersonTest {
	
	public static void main(String[] args) {
		
		
		Person person1 = new Person("홍길동", 100); // heap 에 저장
		Person personBox = person1;
		Person personBox2 = person1.getPerson();
		
		Person personLee = new Person("이순신", 101); // heap 에 저장
		System.out.println("----------------------------------");
		// 위 코드까지는 Heap 메모리 영역에 객체가 2개 생성된 상태이다.
		// 지역변수인 person1, personBox, personBox2 는 같은 객체를 가리킬뿐.
		
		// 연습 문제
		personBox2.setName("teemo");
		person1.showInfo();
		personLee = person1;
		person1.getAge();
		personLee.showInfo();
		
		
		
	}// end of main
	
}// end of class
