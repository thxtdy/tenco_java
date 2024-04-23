package basic.ch18;

public class CarMainTest {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.startCar();
		car1.engine.name = "엔진1";
		car1.engine.price = 3000;
		
		System.out.println(car1.engine.name);
		System.out.println(car1.engine.price + "$");
		
	}
	
}
