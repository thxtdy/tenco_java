package basic.ch09;

public class mushroom {
	
	int hp;
	

	
	public void takehp(int pay) {
		hp -= pay;
	}
	
	
	public void showInfo() {
		System.out.println("버섯버섯 뿡뿡 " + hp);
	}
		
}
