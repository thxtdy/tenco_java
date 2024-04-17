package basic.ch05;

public class OrderProgram {
	public static void main(String[] args) {
		
	
		
	Order Order1 = new Order();
	
	System.out.println(Order1);
	
	
	Order1.Ordernum = 2;
	Order1.Orderlist = "순살과 뼈 사이";
	Order1.Address = "서울과 부산 사이";
	Order1.ID = "qwertyui";
	Order1.PW = "asdfghjk";
	
	System.out.println(Order1.Ordernum);
	System.out.println(Order1.Orderlist);
	System.out.println(Order1.Address);
	System.out.println(Order1.ID);
	System.out.println(Order1.PW);
	
	
	}
}
