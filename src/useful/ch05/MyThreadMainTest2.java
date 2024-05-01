package useful.ch05;

public class MyThreadMainTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		
//		MyThread2 mythread2 = new MyThread2();
//		mythread2.run(); 일반 메서드 호출. <--- 싱글 스레드 (메인 작업자가 진행)
		
		Thread hihi = new Thread(new MyThread2());
		// 새로운 작업자를 생성해서 위임시킬때는 Thread 안에 있는 start() 메소드를 생성해야 한다.
		hihi.start();
		// 결국 다른 작업자에게 일을 위임하려면 쓰레드에 start()를 호출해야 함
		
		System.out.println("Main End");
		
	}
	
}
