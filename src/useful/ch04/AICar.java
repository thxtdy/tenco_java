package useful.ch04;

public class AICar extends Car{

	@Override
	void drive() {
		System.out.println("Tesla 자율 주행 On");
		System.out.println("안전 99% 보장");
	}

	@Override
	void stop() {
		System.out.println("자동으로 멈춥니다.");
		System.out.println("장애물을 감지해서 정지 ");
		
	}

}
