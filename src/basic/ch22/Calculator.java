package basic.ch22;

public abstract class Calculator implements Calc{
	

	// 예상 테스트 값 n1 == 10, n2 == 0
	@Override
	public double divide(int n1, int n2) {
	if(n1 == 0 || n2 ==0) {
		System.out.println("0으로 나눌 수 없습니다.");
		return 0.0;   // <============ 이 조건에 충족할 경우 제어권을 돌림. double 타입이기 때문에 의미없는 0.0 을 찍어둠.
	}
		return n1 / n2;
	}
	
}
