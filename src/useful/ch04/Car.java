package useful.ch04;

public abstract class Car {
	
	void StartCar() {
		System.out.println("시동을 켭니다.");
	}
	
	abstract void drive();
	
	abstract void stop();
	
	void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메소드 패턴의 핵심
	// 메소드 앞에 final 을 붙이면 하위 클래스에서 재정의 불가
	final void run() {
		// 실행의 흐름 만들어보기
		StartCar();
		drive();
		stop();
		turnoff();
	}
	
	
}
