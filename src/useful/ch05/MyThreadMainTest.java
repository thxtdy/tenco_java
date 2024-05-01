package useful.ch05;

public class MyThreadMainTest {

	// 기본적으로 메인 작업자 하나를 가지고 있다. 메인 쓰레드라 한다.
	public static void main(String[] args) {

		System.out.println(Thread.currentThread());

		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread();
		th1.start(); // start 호출되면 run() 메소드가 동작되게 약속되어 있다.
		System.out.println("-------------------------");
		
		// 필요하다면 추가 작업자를 더 만들 수 있다.
		MyThread th2 = new MyThread();
		th2.start();
		
	} // end of main

} // end of class
