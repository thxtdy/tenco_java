package basic.ch18;

public class ComputerMainTest {
	
	public static void main(String[] args) {
		
	
	Computer com1 = new Computer("HP" , 2000);
	
	com1.start();
	
	com1.setAll();
	
//	System.out.println("CPU 종류는 " + com1.cpu.name + "입니다");
//	System.out.println("CPU 가격은 " + com1.cpu.cpuPrice + "$입니다.");
	
//	System.out.println("컴퓨터 모델명과 가격은 " + com1.name + com1.cptprice + "입니다");
	
	com1.all();
	
	com1.stop();
	}	
}
