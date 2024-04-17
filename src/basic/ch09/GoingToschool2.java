package basic.ch09;

public class GoingToschool2 {
	
	// 메인 함수
	public static void main(String[] args) {
		
		// 설계된 클래스를 가지고 본인이 의도한대로 실행의 흐름을 만들어보자.
		
		// 스캐너를 활용해서 1번을 누르면 버스를 태워서 실행의 흐름 만들기
		// 2번을 누르면 지하철을 태우는 실행의 흐름 만들기
		
		
		Bus bus1 = new Bus(100);// 선언만 했음
		Bus bus2 = new Bus(200);// 선언만 했음
		
		subway subway1 = new subway(1);
		subway subway2 = new subway(2);
		
		mushroom mush1 = new mushroom();
	

		
		Student s1 = new Student("티모", 100_000, 570);
		Student s2 = new Student("야훙", 100_000, 560);
		
		System.out.println("-------------");
		s1.takeBus(bus2);
		s1.showInfo();
		System.out.println("-------------");
		s1.takeSubway(subway2);
		s1.showInfo();
		System.out.println("-------------");
		s2.takeBus(bus1);
		s2.showInfo();
		System.out.println("-------------");
		s2.boom(mush1);
		s2.showInfo();
		System.out.println("-------------");
		s1.takeBus(bus2);
		s1.showInfo();
		mush1.showInfo();
		
	}// end of main

}// end of class
