package useful.ch05;

public class WorkerMainTest {
	
	// 메인 작업자 1
	public static void main(String[] args) {
		System.out.println("===========Main Thread Start============");
		System.out.println(Thread.currentThread());
		
		// 작업자 하나 만들어내긩
		Worker wk1 = new Worker("Worker-1"); // 생성은 메인 쓰레드가 함.
		// 명령어를 통해 Worker-1에게, 너가 위임받은 일을 시작해
		wk1.start(); // 메인 쓰레드가 명령내림.
		
		System.out.println("===========Main Thread End============");

		
		Worker wk2 = new Worker("Worker-2");
		
		
	}
	
}
