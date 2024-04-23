package basic.ch18;

public class Computer {
	
	private String name;
	private int cptprice;
	
	CPU cpu;
	
	public Computer(String name, int cptprice){
		cpu = new CPU("i7 - 12700k", 200);
		this.name = name;
		this.cptprice = cptprice;
	}
	public void start() {
		cpu.start();
		System.out.println("컴퓨터 전원 작동");
	}
	public void stop() {
		cpu.stop();
		System.out.println("컴퓨터 전원 종료");
	}
	
	public void all() {
		System.out.println("컴퓨터 모델명과 가격은 " + this.name + ", " + this.cptprice + "$ 입니다");
	}
	public void setAll() {
		System.out.println("CPU 모델명과 가격은 " + cpu.name + ", " + cpu.cpuPrice + "$ 입니다");
	}
}
