package basic.ch18;

public class CPU {
	
	String name;
	int cpunum;
	int cpuPrice;
	
	public CPU(String name, int cpuPrice) {
		this.name = name;
		this.cpuPrice = cpuPrice;
	}
	
	void start() {
		System.out.println("CPU 전원 작동");
	}
	void stop() {
		System.out.println("CPU 전원 종료");
	}
	
}
