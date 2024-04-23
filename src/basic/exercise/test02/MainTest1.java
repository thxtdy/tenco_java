package basic.exercise.test02;

public class MainTest1 {

	static A a;
	
	public static void main(String[] args) {
		
		// 문제 2
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		
		a.setB(b);
		b.setC(c);
		c.setD(d);
		System.out.println(a.getB().getC().getd().getName());
		// 내부에서 객체를 생성하지 않고 외부에서
		// 객체를 주입한 후에 D 에 getName 를 호출하시오
		
		

	}
	
	
}
