package useful.ch03;

public class NickNameMainTest {
	
	public static void main(String[] args) {
		
		NickName nickname = new NickName();
		
		
		String inputnick;
		inputnick = "한글한글";
		
		try {
			nickname.setNick(inputnick);
		} catch(NickNameException e) {
			System.out.println("NickNameException 발생 " + e.getMessage());
		} catch(RuntimeException e) {
			System.out.println("RuntimeException 발생 " + e.getMessage());
		}
		
	}
	
}
