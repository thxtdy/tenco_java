package basic.ch18;

public class Car {
	
	String name;
	int price;
	Engine engine; // 포함 관계(Composition) , has-a
	
	public Car() {
		// 객체 안에 필요 객체를 직접 생성할 경우,
		// 그때를 Composition 관계라고 한다.
		engine = new Engine(); // 객체 생성 매우 중요
		// Car 라는 객체가 생성이 될때
		// Engine 객체도 함께 생성된다. --> 서로 세게 묶임
	}
	
	public void startCar() {
		engine.start();
		System.out.println("자동차가 출발");
	}
	public void stopCar() {
		engine.stop();
		System.out.println("자동차가 멈춤");
	}
	
	
}
