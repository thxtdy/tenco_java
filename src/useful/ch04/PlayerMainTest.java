package useful.ch04;

public class PlayerMainTest {
	public static void main(String[] args) {
		
		Player player1 = Player.getInstance();
		System.out.println(player1);
		
		Player player2 = Player.getInstance();
		System.out.println(player2);
		
	}
}
