package useful.ch04;

public class CarMainTest {
	
	public static void main(String[] args) {
		
		Car aicar = new AICar(); // 다형성, 업캐스팅 된 상태
		aicar.run();
		// 프로그램 실행을 위해 run() 메소드를 호출해야 한다고 약속
		System.out.println("=========================================");
		
		Car Manucar = new ManualCar();
		Manucar.run();
		
	} // end of main
	
} // end of class
