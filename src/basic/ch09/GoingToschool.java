package basic.ch09;

public class GoingToschool {
	
	// 메인 함수
	public static void main(String[] args) {

		// 객체 지향 프로그래밍이란 객체와 객체 간의 관계를 형성하고
		// 상호 작용하게 프로그래밍 한 것.
		
		Bus bus1 = new Bus(100);
		Bus bus2 = new Bus(200);
		subway subway1 = new subway(1);
		subway subway2 = new subway(2);
		subway subway3 = new subway(3);
		
		
		
		// 집중!
		Student student1 = new Student("홍길동", 10000, 300);
		student1.showInfo();
		// 학생이 버스를 탄다
		System.out.println("---------------");
		student1.takeBus(bus2);
		student1.showInfo();
		// 버스의 상태값
		
		System.out.println("---------------");
		bus2.showInfo();
		
		System.out.println("---------------");
		student1.takeSubway(subway1);
		student1.showInfo();
		subway1.showInfo();
		
		System.out.println("---------------");
		subway2.showInfo();
		student1.takeSubway(subway3);
		subway3.showInfo();
		

	}// end of main

}// end of class
