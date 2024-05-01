package useful.ch05;

/**
 * Thread 를 만드는 두번째 방법. Runnable 인터페이스를 활용.
 */
public class MyThread2 implements Runnable{
	
	// Thread 클래스에서 start 메소드가 호출되면
	// 동작하는 부분이라고 약속되어 있다.
	@Override
	public void run() {
		int i = 0;
		while(i < 10) {
			System.out.println("i : " + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
