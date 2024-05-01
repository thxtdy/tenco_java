package useful.ch05;

// How,Why
public class Worker extends Thread{
	
	private String name;
	
	public Worker(String name) {
		this.name = name;
	}
	
	// 약속된 부분 --> run() 메소드를 정의
	@Override
	public void run() {
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Worker : " + name + ", " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
